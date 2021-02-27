package com.ricemarch.chapter6hystrix.client.api;

import com.ricemarch.chaptercommon.chapter5.dto.Instance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ricemarch.chapter6hystrix.client.fallback.*;

@FeignClient(value = "feign-service", fallback = InstanceClientFallBack.class)
public interface InstanceClient {

    @RequestMapping(value = "/instance/{serviceId}", method = RequestMethod.GET)
    Instance getInstanceByServiceId(@PathVariable("serviceId") String serviceId);

}
