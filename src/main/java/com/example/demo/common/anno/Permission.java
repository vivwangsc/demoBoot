package com.example.demo.common.anno;

import java.lang.annotation.*;

/**
 * 权限拦截注解
 * @author Administrator
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Permission {
	
	 String value() ;
	
}
