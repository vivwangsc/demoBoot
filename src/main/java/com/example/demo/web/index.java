package com.example.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class index {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    public String index(ModelMap model)
    {

        logger.debug("hi,this is a message");
        logger.info("hi,this is a message");
        logger.warn("hi,this is a message");

        List list = jdbcTemplate.queryForList("select * from sys_user where id like 'w%'");
        model.addAttribute("user","hello world 王顺初");
        model.addAttribute("users",list);
        return "index";
    }
}
