package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.dao.PortalMemberInfoDao;
import com.macro.mall.portal.domain.PortalMemberInfo;
import com.macro.mall.portal.service.UmsMemberCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *                  ,;,,;
 *                ,;;'(    社
 *      __      ,;;' ' \   会
 *   /'  '\'~~'~' \ /'\.)  主
 * ,;(      )    /  |.     义
 *,;' \    /-.,,(   ) \    码
 *     ) /       ) / )|    农
 *     ||        ||  \)     
 *     (_\       (_\
 * @author ：* @date ：Created in 2020/1/6 22:14
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description: 
 **/
@Service
public class UmsMemberCenterServiceImpl implements UmsMemberCenterService {

    @Autowired
    private PortalMemberInfoDao portalMemberInfoDao;

    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    @Override
    public PortalMemberInfo getMemberInfo(Long memberId) {
        return portalMemberInfoDao.getMemberInfo(memberId);
    }
}
