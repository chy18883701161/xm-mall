package com.chy.mall.controller.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 首页配置商品VO
 */
@Getter
@Setter
public class MallIndexConfigGoodsVO implements Serializable {

    private Long goodsId;

    private String goodsName;

    private String goodsIntro;

    private String goodsCoverImg;

    private Integer sellingPrice;

    private String tag;

}
