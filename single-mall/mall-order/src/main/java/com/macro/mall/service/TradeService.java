package com.macro.mall.service;

import com.macro.mall.common.exception.BusinessException;
import com.macro.mall.domain.OrderDetail;

/**
 * @author ：* @date ：Created in 2020/3/26
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
public interface TradeService {

    /**
     * 根据订单生成支付二维码，本质就是去alipay下订单
     * @param orderDetail
     */
    String tradeQrCode(OrderDetail orderDetail) throws BusinessException;

    /**
     * 查询订单支付状态
     * @param orderSn
     * @return
     */
    String alipayTradeQuery(String orderSn) throws Exception;
}
