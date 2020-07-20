package com.youxiu326.alibaba.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: lihui
 * @Date: 2020-07-20 23:09
 * @Description:
 */
@FeignClient("nacos-discovery-provider")
public interface DemoFeignService {

    @GetMapping("/demo")
    public String demo(@RequestParam("name") String name);
}
