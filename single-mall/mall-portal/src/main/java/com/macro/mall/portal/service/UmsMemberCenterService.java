package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.PortalMemberInfo;

/**
 * @author ：* @date ：Created in 2020/1/6
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
public interface UmsMemberCenterService {

    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
