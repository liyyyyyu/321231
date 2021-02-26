package com.macro.mall.service;

import com.macro.mall.common.exception.BusinessException;
import com.macro.mall.domain.Register;
import com.macro.mall.domain.UmsMember;

/**
*
 * @author ：* @date ：Created in 2020/3/22
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
public interface MemberService {

    /**
     * @return
     *  otpCode
     */
    public String getOtpCode(String telPhone) throws BusinessException;

    /**
     * 用户简单信息注册
     * @return
     */
    public int regite(Register register) throws BusinessException;

    public UmsMember login(String username, String password) throws BusinessException;
}
