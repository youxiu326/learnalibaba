package com.youxiu326.alibaba.seata.controller;

import com.youxiu326.alibaba.seata.service.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-07-23 00:25
 * @Description:
 */
@RestController
public class BizController {

    @Autowired
    private BizService bizService;

    @GetMapping("/biz")
    public String biz() {
        bizService.biz();
        return "success";
    }
}
