package com.youxiu326.alibaba.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-20 22:36
 * @Description:
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(String name){
        return "hello" + name;
    }


}
