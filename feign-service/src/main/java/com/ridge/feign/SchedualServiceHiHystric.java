package com.ridge.feign;

import org.springframework.stereotype.Component;

/**
 * Summary:
 * Created by wuyunfeng on 26. 十月 2017 上午11:09.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
