package com.tian.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "error " + name;
    }
}
