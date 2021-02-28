package com.ricemarch.chapter6hystrix.client.fallback;

import com.ricemarch.chapter6hystrix.client.api.InstanceClient;
import com.ricemarch.chaptercommon.chapter5.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//InstanceClientFallBack继承InstanceClient接口，提供相相关回滚方法
@Component
public class InstanceClientFallBack implements InstanceClient {

    public static final Logger logger = LoggerFactory.getLogger(InstanceClientFallBack.class);

    @Override
    public Instance getInstanceByServiceId(String serviceId) {
//        return null;
        logger.info("Can not get Instance by serviceId {}", serviceId);
        return new Instance("error", "error", 0);
    }
}
