package com.example.demo.common.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.common.dao.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

/**
 * 基础数据控制器
 * 包括基础的增删改查的方法
 * @author 王顺初
 * @date 2017年11月27日
 */
public abstract class CrudController<T> extends SuperController{

	@Autowired
	protected BaseRepository<T> service;

	@Autowired
	private JdbcTemplate jdbcTemplate;


	@SuppressWarnings("unchecked")
	//获取类的类型
	public Class<T> getEntityClass()
	{
		Class<T> tClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return tClass;
	}

    /**
     * 返回所有数据
     * @return
     */
	@RequestMapping("/findAll")
	public ModelAndView findAll(){
		List<T> list = service.findAll();
		return returnResult(null,list);
	}

	/**
	 * 处理分页与排序的事项
	 * 正常的处理都是需要分页与排序的
	 * @return
	 */
	@RequestMapping("/findPage")
	public ModelAndView findPage(String sql ){

		//分页信息
		List ls1 = jdbcTemplate.query(sql,new BeanPropertyRowMapper(getEntityClass()));

		//jdbcTemplate.query()
		List<T> list = service.findAll();
		return returnResult(null,list);
	}

	//新增实体
	@RequestMapping("/add")
	public ModelAndView add(){
		return returnResult("add",null);
	}

	//显示编辑实体操作
	@RequestMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable String id){
        Optional<T> entity = service.findById(id);
		return returnResult("editPage",entity);
	}

	//执行新增实体操作
	@RequestMapping("/doAdd")
	public ModelAndView doAdd(T entity){
		service.save(entity);
		return returnResult("page",null);
	}

	//执行删除实体操作
	@RequestMapping("/doDelete")
	public ModelAndView doDelete(@RequestParam("id") String id){
		service.deleteById(id);
		return returnResult("page",null);
	}

	//执行编辑实体操作
	@RequestMapping("/doEdit")
	public ModelAndView doEdit(T entity){
		service.save(entity);
		return returnResult("editPage",null);
	}

	//执行webApi的数据表格操作,请求类似于datawindow的updat方法
	@RequestMapping(value = "/doUpdate",method = RequestMethod.POST)
	@Transactional
	public ModelAndView update(@RequestParam("add") String sAdd, @RequestParam("mdy") String sMdy, @RequestParam("del") String sDel) {
		try {
			Object tt = getEntityClass();
			List<T> listAdd = JSON.parseArray(sAdd, getEntityClass());
			listAdd = service.saveAll(listAdd);
			List<T> listMdy = JSON.parseArray(sMdy, getEntityClass());
			listMdy = service.saveAll(listMdy);
			List<T> listDel = JSON.parseArray(sDel, getEntityClass());
			service.deleteAll(listDel);
			service.flush();

			//返回更新后的对象,供前台修改rowversion字段
			//flush后对象已经同步，记得
			listMdy.addAll(listAdd);
			return returnRaw(renderSuccess("成功",listMdy));
		}
		catch (Exception ex)
		{
			return returnRaw(renderError(ex.toString()));
		}
	}
}

