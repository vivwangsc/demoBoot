package com.example.demo.bluewise.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

@Data
@Entity
@Table(name = "sys_user")
public class SysUserEntity implements Serializable {

private static final long serialVersionUID = 1L;

	    @Id
		@GeneratedValue(generator="system_uuid")
		@GenericGenerator(name="system_uuid",strategy="uuid")
		@Column(name = "id")
			private String id;
			
	    @Column(name = "version")
		    @Version
		private Integer version;
		
    // 扩展信息
	    @Column(name = "extInfo")
			private String extInfo;
		
    // 姓名
	    @Column(name = "name")
			private String name;
		
    // 登录名
	    @Column(name = "loginname")
			private String loginName;
		
    // 性别
	    @Column(name = "sex")
			private String sex;
		
    // 出生日期
	    @Column(name = "birthday")
			private Date birthday;
		
    // 密码
	    @Column(name = "password")
			private String password;
		
    // 手机
	    @Column(name = "mobile")
			private String mobile;
		
    // qq号码
	    @Column(name = "qq")
			private String qq;
			
	    @Column(name = "email")
			private String email;
		
    // 部门
	    @Column(name = "deptId")
			private String deptId;
		
    // 所属角色
	    @Column(name = "roles")
			private String roles;

	@Transient
	    private  String dept_name;

        }
