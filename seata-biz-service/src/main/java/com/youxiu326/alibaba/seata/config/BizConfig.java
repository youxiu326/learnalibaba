package com.youxiu326.alibaba.seata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: lihui
 * @Date: 2020-07-23 00:12
 * @Description:
 */
@Configuration
public class BizConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
