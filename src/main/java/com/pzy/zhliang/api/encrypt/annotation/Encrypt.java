package com.pzy.zhliang.api.encrypt.annotation;

import java.lang.annotation.*;

/**
 * 加密注解
 * 对返回值进行加密处理
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Encrypt{

}
