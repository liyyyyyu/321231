package com.macro.mall.portal.dao;

import com.macro.mall.portal.domain.PmsCommentParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
 * @author ：* @date ：Created in 2020/2/9 13:56
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description: 
 **/
public interface PortalProductCommentDao {

    List<PmsCommentParam> getCommentList(Long productId);

    Integer selectUserOrder(@Param("userId") Long userId, @Param("productId") Long productId);
}
