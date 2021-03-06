package com.youxiu326.alibaba.sentinelcore.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-22 15:34
 * @Description:
 */
@RestController
public class ParamController {

    @GetMapping("/param")
    @SentinelResource(value = "param",blockHandler = "exHandler")
    public String param(String type) {
        return "success";
    }

    public String exHandler(String type, BlockException ex) {
        return "exHandler error";
    }

}
