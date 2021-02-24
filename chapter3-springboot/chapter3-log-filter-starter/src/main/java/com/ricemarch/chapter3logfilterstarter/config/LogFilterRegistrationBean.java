package com.ricemarch.chapter3logfilterstarter.config;

import com.ricemarch.chapter3logfilterstarter.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

/**
 * @author RiceMarch
 * @date 2021/2/21 22:27
 */
public class LogFilterRegistrationBean extends FilterRegistrationBean<LogFilter> {

    public LogFilterRegistrationBean() {
        super();
        //添加LogFilter过滤器
        this.setFilter(new LogFilter());
        // 匹配所有路径
        this.addUrlPatterns("/*");
        // 定义过滤器名
        this.setName("LogFilter");
        // 设置优先级
        this.setOrder(1);

    }
}
