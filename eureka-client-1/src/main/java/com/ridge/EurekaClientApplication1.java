package com.ridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication1.class, args);
    }
}
