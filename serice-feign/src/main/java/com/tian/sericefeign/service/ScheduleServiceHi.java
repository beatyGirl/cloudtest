package com.tian.sericefeign.service;

import com.tian.sericefeign.service.impl.ScheduleServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-client", fallback = ScheduleServiceHiHystric.class)
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
