package com.example.demo.bluewise.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王顺初
 * @since 2017-11-17
 */

//@Converter(autoApply = true)
@Data
@Entity
@Table(name = "sys_function")
public class SysFunctionEntity implements Serializable {

private static final long serialVersionUID = 1L;

			
    // 系统功能表
							
	    @Id
			private String id;
			
	    @Column(name = "name")
			private String name;
			
	    @Column(name = "functype")
			private String functype;
			
	    @Column(name = "icon")
			private String icon;
			
	    @Column(name = "levelCode")
			private String levelCode;
			
	    @Column(name = "comment")
			private String comment;
		
    // 访问路径
		
	    @Column(name = "url")
			private String url;
			
	    @Column(name = "parameter")
			private String parameter;

	    @Column(name = "createDate")
				private LocalDateTime createDate;

        }
