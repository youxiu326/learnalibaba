package com.youxiu326.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients     // 开启feign
@EnableDiscoveryClient  // 开启服务发现
@SpringBootApplication
public class NacosDiscoveryConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerFeignApplication.class, args);
    }

}
