package com.macro.mall.controller;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
*
 * @author ：* @date ：Created in 2020/3/22
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
public class BaseController {

    public HttpServletRequest getRequest(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    public HttpServletResponse getResponse(){
        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
    }

    public HttpSession getHttpSession(){
        return getRequest().getSession();
    }

}
