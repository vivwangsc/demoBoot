package com.example.demo.common.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 记录数据更改日志注解
 * @author wsc
 *
 */

@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface DataLog {
	String name() default "";
}
