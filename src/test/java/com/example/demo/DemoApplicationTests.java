package com.example.demo;

import com.example.demo.bluewise.entity.SysUserEntity;
import com.example.demo.bluewise.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ISysUserService userService;

    @Test
    public void contextLoads() {
        String s = jdbcTemplate.queryForList("select * from sys_user ").toString();
        System.out.println(s);
    }

    @Test
    @Transactional
    public void tes1()
    {
//        System.out.println(userService.findAll().toString());
        List<SysUserEntity> ls =  userService.findAll();
        for (SysUserEntity entity:ls) {
            if(entity.getQq()==null)
                entity.setQq("1");
            else
                entity.setQq(entity.getQq() + "1");
        }
        ls.get(0).setId(null);

        userService.saveAll(ls);
    }

    @Test
    public void tes2()
    {
//        System.out.println(userService.findAll().toString());
        SysUserEntity entity = new SysUserEntity();
        entity.setQq("11481376");
        entity.setLoginName("wsc11");
        entity.setName("王顺初");
        entity.setSex("男");
        entity.setBirthday(new Date());
        userService.saveAndFlush(entity);
        System.out.println(entity);
    }

}
