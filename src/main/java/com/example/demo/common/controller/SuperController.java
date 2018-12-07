package com.example.demo.common.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.common.bean.Token;
import com.example.demo.common.util.JsonResult;
import com.example.demo.common.util.TokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 基础控制器
 * @author Gaojun.Zhou
 * @date 2016年12月27日 上午11:50:57
 */
public abstract class SuperController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	@Autowired
	protected HttpSession session;

	@Autowired
	protected ServletContext application;

	/**
	 * 返回登录 Token
	 */
	protected Token getSSOToken() {
		Token tk = TokenUtil.getToken(request);
		if (tk == null) {
			throw new RuntimeException("-1,The user does not exist, please relogin.");
		}
		return tk;
	}



	/**
	 * /**
	 * 重定向至地址 url
	 *
	 * @param url 请求地址
	 * @return
	 */
	protected String redirectTo(String url) {
		StringBuffer rto = new StringBuffer("redirect:");
		rto.append(url);
		return rto.toString();
	}

	/**
	 * 渲染失败数据（带消息）
	 *
	 * @param msg 需要返回的消息
	 * @return result
	 */
	protected JsonResult renderError(String msg) {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setStatus("500");
		result.setMsg(msg);
		return result;
	}

	/**
	 * 渲染成功数据
	 *
	 * @return result
	 */
	protected JsonResult renderSuccess(String msg, Object oo) {
		JsonResult result = new JsonResult();
		result.setSuccess(true);
		result.setStatus("200");
		result.setMsg(msg);
		result.setData(oo);
		return result;
	}

	/**
	 * 内部格式化类
	 *
	 * @param obj 要格式化的对象
	 * @return 格式化成功后的json字符串
	 */
	protected String toString(Object obj)
	{
		return JSON.toJSONStringWithDateFormat(obj,"yyyy-MM-dd HH:mm:ss.SSS");
	}


	/**
	 * 根据参数自动返回对应的类型
	 * 返回的类型有三类：一类是jsonp,跨域调用，一类是普通json,一类是普通视图与模板
	 *
	 * @param ViewName
	 * @param Data
	 * @return
	 */
	protected ModelAndView returnResult(String ViewName, Object Data) {
		//判断是否jsonp请求
		String callback = request.getParameter("callback");
		if (callback != null) {
			try {
				String ls =  toString(renderSuccess("ok", Data));
				ls = callback + "(" + ls + ");";
				response.getWriter().write(ls);
				return null;
			} catch (Exception ex) {
				return null;
			}
		}

		//判断是否ajax请求
		String ajax = request.getHeader("X-Requested-With");
		if (ajax != null) {
			try {
				response.getWriter().write(toString(renderSuccess("ok", Data)));
				return null;
			} catch (Exception ex) {
				return null;
			}
		}

		//普通的web请求
		ModelAndView mv = new ModelAndView();
		if (ViewName == null || ViewName.isEmpty()) {
			mv.setViewName(request.getPathInfo());
			return mv;
		}
		else {
			mv.setViewName(ViewName);
			mv.addObject("data", Data);
			return mv;
		}
	}

	//返回原始数据
	protected ModelAndView returnRaw(Object Data) {
		try {
			response.setHeader("Content-Type","application/json");
			response.getWriter().write(toString(Data));
			response.getWriter().flush();
			return null;
		} catch (Exception ex) {
			return null;
		}
	}
}

