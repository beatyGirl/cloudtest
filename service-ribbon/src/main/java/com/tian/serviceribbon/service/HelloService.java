package com.tian.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {//cloud-client
        return restTemplate.getForObject("http://CLOUD-CLIENT/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi " + name + ", sorry error!";
    }
}
