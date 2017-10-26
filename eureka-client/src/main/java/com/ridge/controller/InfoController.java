package com.ridge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Summary: 返回 服务信息
 * Created by wuyunfeng on 26. 十月 2017 上午9:55.
 */
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){
        return "这是应用发现ribbon service";
    }

}
