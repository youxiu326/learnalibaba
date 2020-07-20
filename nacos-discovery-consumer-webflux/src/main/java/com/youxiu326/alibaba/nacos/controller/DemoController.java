package com.youxiu326.alibaba.nacos.controller;

import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.alibaba.nacos.ribbon.NacosServer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.apache.RibbonLoadBalancingHttpClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Map;

/**
 * @Auther: lihui
 * @Date: 2020-07-20 22:37
 * @Description:
 */
@RestController
public class DemoController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    /**
     * webflux
     */
    @GetMapping("/test")
    public Mono<String> test(String name){

        return webClientBuilder.build()
                .get()
                .uri("http://nacos-discovery-provider/demo?name=" + name)
                .retrieve()
                .bodyToMono(String.class);
    }



}
