package com.youxiu326.alibaba.seata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: lihui
 * @Date: 2020-07-23 00:13
 * @Description:
 */
@Service
public class OrderService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    public void save() {
        jdbcTemplate.update("INSERT INTO `order`( `username`) VALUES ('123');");
    }
}
