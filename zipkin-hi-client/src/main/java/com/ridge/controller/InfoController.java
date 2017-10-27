package com.ridge.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Summary: 返回 服务信息
 * Created by wuyunfeng on 26. 十月 2017 上午9:55.
 */
@RestController
public class InfoController {

    @Value("${spring.application.name}")
    private String serverName;

    // TODO: 2017/10/27   这里 被 冲掉了  后续 需要排查
    @GetMapping("/info1")
    public String info() {
        return "这是应用发现 " + serverName;
    }


    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }

}
