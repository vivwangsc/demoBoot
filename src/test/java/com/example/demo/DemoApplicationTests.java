package com.example.demo;

import com.example.demo.bluewise.entity.SysUserEntity;
import com.example.demo.bluewise.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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

    /***
     * 查询所有包含肖的用户
     */
    @Test
    public void testQuery1()
    {
        SysUserEntity entity = new SysUserEntity();
        entity.setName("肖");
        Example<SysUserEntity> example = Example.of(entity);
        System.out.printf(userService.findAll(example).toString());
        List list =  userService.findAll(new Specification<SysUserEntity>() {
            @Override
            public Predicate toPredicate(Root<SysUserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                Predicate p1 = cb.like(root.get("name").as(String.class), "%肖%");
                Predicate p2 = cb.like(root.get("name").as(String.class), "%王%");
                return cb.or(p1,p2);
            }
        });
        System.out.println(list);

    }

}
