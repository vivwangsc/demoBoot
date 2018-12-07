package com.example.demo.bluewise.controller;

import com.example.demo.bluewise.entity.SysFunctionEntity;
import com.example.demo.common.controller.CrudController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/system/sysFunction")
public class SysFuctionController extends CrudController<SysFunctionEntity> {

	//获取所有数据
	@RequestMapping("/wsc")
	public ModelAndView wsc(){
		return returnRaw("I am wangsc");
	}

}
