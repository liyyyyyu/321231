package com.macro.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ：* @date ：Created in 2020/2/14
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Configuration
@EnableTransactionManagement //开启事务
@MapperScan(basePackages = {"com.macro.mall.mapper","com.macro.mall.dao"})
public class MybatisConfiguration {
}
