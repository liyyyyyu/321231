package com.macro.mall.domain;

import lombok.Data;

import java.util.List;

/**
*
 * @author ：* @date ：Created in 2020/3/26
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/

@Data
public class OrderDetail extends OmsOrder {

    private List<OmsOrderItem> itemList;

}
