package com.ricemarch.ribbon.client;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author tanwentao
 */
public class RibbonConfiguration {

    @Autowired
    IClientConfig ribbonClientConfig;

    // 使用该IPing会导致ZoneAwareLoadbalancer中的uplist为0，从而导致no instance
//    @Bean
//    public IPing ribbonPing() {
//        return new PingUrl();
//    }

    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}