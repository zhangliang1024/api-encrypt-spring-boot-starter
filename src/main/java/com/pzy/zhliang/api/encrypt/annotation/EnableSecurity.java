package com.pzy.zhliang.api.encrypt.annotation;

import com.pzy.zhliang.api.encrypt.advice.EncryptRequestBodyAdvice;
import com.pzy.zhliang.api.encrypt.advice.EncryptResponseBodyAdvice;
import com.pzy.zhliang.api.encrypt.config.SecretKeyConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启动加解密
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Import({SecretKeyConfig.class,
        EncryptResponseBodyAdvice.class,
        EncryptRequestBodyAdvice.class})
public @interface EnableSecurity{

}
