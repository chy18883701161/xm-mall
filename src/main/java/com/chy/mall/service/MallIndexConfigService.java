package com.chy.mall.service;

import com.chy.mall.controller.vo.MallIndexConfigGoodsVO;
import com.chy.mall.entity.IndexConfig;
import com.chy.mall.util.PageQueryUtil;
import com.chy.mall.util.PageResult;

import java.util.List;

public interface MallIndexConfigService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getConfigsPage(PageQueryUtil pageUtil);

    String saveIndexConfig(IndexConfig indexConfig);

    String updateIndexConfig(IndexConfig indexConfig);

    IndexConfig getIndexConfigById(Long id);

    /**
     * 返回固定数量的首页配置商品对象(首页调用)
     *
     * @param number
     * @return
     */
    List<MallIndexConfigGoodsVO> getConfigGoodsesForIndex(int configType, int number);

    Boolean deleteBatch(Long[] ids);
}
