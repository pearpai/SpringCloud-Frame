package com.ridge.controller;

import com.ridge.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Summary: 提供一些 简单的demo restful
 * Created by wuyunfeng on 26. 十月 2017 上午10:14.
 */
@RestController
public class DemoController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println("1111");
        return schedualServiceHi.sayHiFromClientOne(name);
    }


}
