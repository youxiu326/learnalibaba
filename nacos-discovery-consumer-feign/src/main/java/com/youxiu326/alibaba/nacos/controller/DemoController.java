package com.youxiu326.alibaba.nacos.controller;

import com.youxiu326.alibaba.nacos.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-20 23:09
 * @Description:
 */
@RestController
public class DemoController {

    @Autowired
    private DemoFeignService demoFeignService;

    @GetMapping("/demo")
    public String demo(String name){
        return demoFeignService.demo(name);
    }

}
