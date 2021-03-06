package com.pzy.zhliang.api.encrypt.annotation;

import java.lang.annotation.*;

/**
 * 解密注解
 * 对请求体进行解密处理
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Decrypt{

}
