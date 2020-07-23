package com.youxiu326.alibaba.seata.controller;

import com.youxiu326.alibaba.seata.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-23 00:14
 * @Description:
 */
@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public String pay() {
        payService.save();
        return "success";
    }
}
