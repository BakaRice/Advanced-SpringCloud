package com.ricemarch.chapter3logfilterstarter.annotation;

import com.ricemarch.chapter3logfilterstarter.config.EnableLogFilterImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 开启过滤器日志
 *
 * @author RiceMarch
 * @date 2021/2/21 22:36
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EnableLogFilterImportSelector.class) //引入LogFilterAutoConfiguration配置类
public @interface EnableLogFilter {
}
