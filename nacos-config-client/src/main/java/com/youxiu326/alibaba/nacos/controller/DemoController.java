package com.youxiu326.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-20 23:48
 * @Description:
 */
@RefreshScope // 声明刷新能实时
@RestController
public class DemoController {

    @Value("${test:空test}")
    public String str;

    @GetMapping("/test/config")
    public String test() {
        return str;
    }
}
