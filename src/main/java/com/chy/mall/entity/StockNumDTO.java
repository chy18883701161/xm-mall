package com.chy.mall.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 库存修改所需实体
 */
@Getter
@Setter
@ToString
public class StockNumDTO {
    private Long goodsId;

    private Integer goodsCount;

}
