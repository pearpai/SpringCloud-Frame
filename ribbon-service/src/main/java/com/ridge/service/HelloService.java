package com.ridge.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Summary:
 * Created by wuyunfeng on 26. 十月 2017 上午10:21.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT-1/hi?name=" + name, String.class);
    }


    @SuppressWarnings("unused")
    public String hiError(String name){
        return "hi," + name + ",sorry, error!";
    }

}
