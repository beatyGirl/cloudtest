package com.tian.sericefeign.service.impl;

import com.tian.sericefeign.service.ScheduleServiceHi;
import org.springframework.stereotype.Component;

@Component("scheduleServiceHi")
public class ScheduleServiceHiHystric implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "error " + name;
    }
}
