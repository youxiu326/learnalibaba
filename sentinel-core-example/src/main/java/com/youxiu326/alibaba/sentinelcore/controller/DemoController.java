package com.youxiu326.alibaba.sentinelcore.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-22 13:41
 * @Description:
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "hello sentinel";
    }

    @GetMapping("/hello2")
    @SentinelResource(value = "hello2")
    public String hello2(){
        return "hello2 sentinel";
    }


}
