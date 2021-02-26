package com.ricemarch.chapter6hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ricemarch.chaptercommon.chapter5.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InstanceService {

    private static String DEFAULT_SERVICE_ID = "application";
    private static String DEFAULT_HOST = "localhost";
    private static int DEFAULT_PORT = 8080;

    private static Logger logger = LoggerFactory.getLogger(InstanceService.class);

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "instanceInfoGetFail")
    public Instance getInstanceByServiceIdWitchRestTemplate(String serviceId) {
        Instance instance = restTemplate.getForEntity("http://FEIGN-SERVICE/instance/{serviceId}", Instance.class, serviceId).getBody();
        return instance;
    }

    private Instance instanceInfoGetFail(String serviceId) {
        logger.info("Can not Instance by serviceId {}", serviceId);
        return new Instance("error", "error", 0);
    }
}
