package com.example.demo.bluewise.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.common.controller.SuperController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wsc")
public class IndexController extends SuperController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询首页的信息
     */
    @RequestMapping("/index")
    public  String index(){
        System.out.println(request.getHeader("user-agent"));

        return "main";
    }

    @RequestMapping("/home")
    public  String home(){
        return "homePage";
    }

    @RequestMapping("/icon")
    public  String icon(){
        return "base/icon/icon_selector";
    }

    @RequestMapping("/function")
    @ResponseBody
    public  String function(){
        Object lo =  jdbcTemplate.queryForList("select * from sys_function order by levelcode");
        return JSON.toJSONString(lo,true);
    }
}
