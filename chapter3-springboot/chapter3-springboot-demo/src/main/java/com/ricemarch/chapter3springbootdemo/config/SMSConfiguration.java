package com.ricemarch.chapter3springbootdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RiceMarch
 * @date 2021/2/21 21:50
 */
@ConfigurationProperties(prefix = "sms")
@Configuration
@Data
public class SMSConfiguration {
    private int retryLimitationMinutes;

    private int validityMinute;

    private final List<String> types = new ArrayList<>();

}
