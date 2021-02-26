package com.macro.mall.portal.domain;

import com.macro.mall.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ：* @date ：Created in 2020/1/8
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Data
public class FlashPromotionSessionExt extends SmsFlashPromotionSession {
    @ApiModelProperty(value = "活动状态#根据时间进行判断",notes = "0->进行中,1->即将开始,2->已结束")
    private Integer sessionStatus;
    @ApiModelProperty(value = "当前秒杀活动ID")
    private Long flashPromotionId;
}
