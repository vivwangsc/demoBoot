package com.example.demo.bluewise.controller;

import com.example.demo.bluewise.entity.SysDepartmentEntity;
import com.example.demo.common.controller.CrudController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这是一个测试，最简单的关于页面的测试
 * 不引入任何的jquery与其他任何的信息，单纯的html实现crud的操作
 */

@Controller
@RequestMapping("/dept")
public class SysDepartmentController extends CrudController<SysDepartmentEntity> {

	//获取所有数据
	@RequestMapping("/list")
	public ModelAndView list(){
		return returnRaw(service.findAll().toString());
	}

	//编辑单个数据
	@RequestMapping("/edit")
	public ModelAndView edit(){
		return returnRaw("I am wangsc");
	}

}
