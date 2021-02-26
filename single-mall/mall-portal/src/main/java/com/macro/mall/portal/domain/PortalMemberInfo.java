package com.macro.mall.portal.domain;

import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberLevel;
import lombok.Data;

/**
 * @author ：* @date ：Created in 2020/1/6 21:12
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Data
public class PortalMemberInfo extends UmsMember {
    private UmsMemberLevel umsMemberLevel;
}
