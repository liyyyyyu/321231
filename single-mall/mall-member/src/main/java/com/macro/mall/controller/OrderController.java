package com.macro.mall.controller;

import com.macro.mall.domain.UmsMember;
import com.macro.mall.interceptor.AuthInterceptorHandler;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*
 * @author ：* @date ：Created in 2020/3/22
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Slf4j
@RestController
public class OrderController extends BaseController {

    @GetMapping("/order")
    public String order(){

        /*UmsMember member = (UmsMember)getHttpSession().getAttribute("member");
        log.info("下订单->jvm-8080,user:{}"+member.getUsername());
        return "下订单->jvm-8080,user:->"+member.getUsername();*/
        Claims claims = (Claims) getRequest().getAttribute(AuthInterceptorHandler.GLOBAL_JWT_USER_INFO);
        log.info(String.format("下订单->jvm-8080,user:%s",claims.get("sub")));
        return String.format("下订单->jvm-8080,user:%s",claims.get("sub"));
    }
}
