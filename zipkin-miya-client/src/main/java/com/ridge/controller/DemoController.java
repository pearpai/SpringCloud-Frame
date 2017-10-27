package com.ridge.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Summary: 提供一些 简单的demo restful
 * Created by wuyunfeng on 26. 十月 2017 上午10:14.
 */
@RestController
public class DemoController {

    private static final Logger logger = Logger.getLogger(DemoController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


    @RequestMapping("/hi")
    public String home() {
        logger.log(Level.INFO, "calling trace zipkin-miya-client  ");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        logger.log(Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8988/info1",String.class);
    }

}
