package com.example.demo.common.anno;


import com.example.demo.common.enums.Action;

import java.lang.annotation.*;

/**
 * 记录业务日志
 * @author Administrator
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {

	/**
	 * 执行动作
	 * {@link Action}
	 */
	Action action() default Action.Normal;
	
}