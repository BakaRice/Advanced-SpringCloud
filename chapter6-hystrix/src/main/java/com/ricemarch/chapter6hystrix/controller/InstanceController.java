package com.ricemarch.chapter6hystrix.controller;

import com.ricemarch.chapter6hystrix.service.InstanceService;
import com.ricemarch.chaptercommon.chapter5.dto.Instance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/instance")
public class InstanceController {
    private static final Logger logger = LoggerFactory.getLogger(InstanceController.class);


    @Autowired
    InstanceService instanceService;

    @RequestMapping(value = "rest-template/{serviceId}", method = RequestMethod.GET)
    public Instance getInstanceByServiceIdWithRestTemplate(@PathVariable("serviceId") String serviceId) {
        logger.info("Get Instance by serviceId {}", serviceId);

        return instanceService.getInstanceByServiceIdWitchRestTemplate(serviceId);
    }

    @RequestMapping(value = "feign/{serviceId}", method = RequestMethod.GET)
    public Instance getInstanceByServiceIdWithFeign(@PathVariable("serviceId") String serviceId) {
        logger.info("Get Instance by serviceId {}", serviceId);
        return instanceService.getInstnceByServiceIdWithFeign(serviceId);
    }
}
