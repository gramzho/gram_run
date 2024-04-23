package com.gram.annotaion_usage.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: zotij
 * @Date: 2024/3/30  15:35
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface MyAnnotation {
    int id() default 0;
    String describe() default  "";
}
