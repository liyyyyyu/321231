package com.macro.mall.common.exception;

/**
*
 * @author ：* @date ：Created in 2020/2/4
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
public class BusinessException extends Exception {

    public BusinessException(){super();}

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
