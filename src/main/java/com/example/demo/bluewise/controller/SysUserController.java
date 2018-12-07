package com.example.demo.bluewise.controller;

import com.example.demo.bluewise.entity.SysUserEntity;
import com.example.demo.bluewise.service.ISysUserService;
import com.example.demo.common.controller.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *本类操作数据库
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Controller
@RequestMapping("/system/sysUser")
public class SysUserController extends CrudController<SysUserEntity> {
	@Autowired
    private ISysUserService sysUserService;

	@RequestMapping("/wsc")
	public ModelAndView wsc()
	{
		System.out.println("I am a test to visit wsc.html");
		return returnResult(null,null);
	}

	@RequestMapping("/server")
	public ModelAndView server()
	{
		return returnResult(null,null);
	}

	//首页
	@RequestMapping("/index")
	public ModelAndView index(){
		return returnResult(null,null);
	}

	@RequestMapping("/table")
	public ModelAndView table(){
		return returnResult(null,null);
	}

    //获取分页数据
	@RequestMapping("/listPage/{pageNumber}")
	public ModelAndView list(@PathVariable Integer pageNumber, @RequestParam(defaultValue="15") Integer pageSize){
		//需要处理条件与排序
		PageRequest pr = new PageRequest(pageNumber,pageSize);
		Page<SysUserEntity> pageData =  sysUserService.findAll(pr);
        return returnResult("page",pageData);
	}

}
