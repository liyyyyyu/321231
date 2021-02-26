package com.macro.mall.portal.domain;

import com.macro.mall.model.PmsComment;
import com.macro.mall.model.PmsCommentReplay;
import lombok.Data;
import java.util.List;
/**
 *                 ,;,,;
 *               ,;;'(    社
 *      __      ,;;' ' \  会
 *  /'  '\'~~'~' \ /'\.)  主
 *  ,;(      )    /  |.   义
 *  ,;' \    /-.,,(   ) \ 码
 *  ) /       ) / )|      农
 *  ||        ||  \)
 * (_\       (_\
 *
 * @author ：* @date ：Created in 2020/2/9
 * @version: V1.0
 * @slogan: 时间证明一切
 * @description:
 **/
@Data
public class PmsCommentParam extends PmsComment {
    private List<PmsCommentReplay> pmsCommentReplayList;
}
