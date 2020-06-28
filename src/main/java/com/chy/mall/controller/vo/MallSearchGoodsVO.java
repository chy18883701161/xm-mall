package com.chy.mall.controller.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 搜索列表页商品VO
 */
@Getter
@Setter
public class MallSearchGoodsVO implements Serializable {

    private Long goodsId;

    private String goodsName;

    private String goodsIntro;

    private String goodsCoverImg;

    private Integer sellingPrice;

}
