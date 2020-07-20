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
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test(String name){

        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        URI uri = serviceInstance.getUri();

        return restTemplate.getForObject(uri + "/demo?name=" + name,String.class);
    }

    /**
     * 负载均衡
     * @param name
     * @return
     */
    @GetMapping("/test2")
    public String test2(String name){

        // ribbon负载均衡 添加@LoadBalanced注解
        return restTemplate.getForObject("http://nacos-discovery-provider/demo?name=" + name,String.class);
    }

    /**
     * 取得元数据
     * @param name
     * @return
     */
    @GetMapping("/test3")
    public String test3(String name){

        RibbonLoadBalancerClient.RibbonServer ribbonServer = (RibbonLoadBalancerClient.RibbonServer) loadBalancerClient.choose("nacos-discovery-provider");
        NacosServer nacosServer = (NacosServer) ribbonServer.getServer();
        System.out.println("-->" + nacosServer.getMetadata());

        return restTemplate.getForObject("http://nacos-discovery-provider/demo?name=" + name,String.class);
    }

}
