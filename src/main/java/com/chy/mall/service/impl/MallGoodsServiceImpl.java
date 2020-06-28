package com.chy.mall.service.impl;

import com.chy.mall.controller.vo.MallSearchGoodsVO;
import com.chy.mall.common.ServiceResultEnum;
import com.chy.mall.dao.GoodsMapper;
import com.chy.mall.entity.MallGoods;
import com.chy.mall.service.MallGoodsService;
import com.chy.mall.util.BeanUtil;
import com.chy.mall.util.PageQueryUtil;
import com.chy.mall.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MallGoodsServiceImpl implements MallGoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public PageResult getMallGoodsPage(PageQueryUtil pageUtil) {
        List<MallGoods> goodsList = goodsMapper.findNewBeeMallGoodsList(pageUtil);
        int total = goodsMapper.getTotalNewBeeMallGoods(pageUtil);
        PageResult pageResult = new PageResult(goodsList, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }

    @Override
    public String saveMallGoods(MallGoods goods) {
        if (goodsMapper.insertSelective(goods) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    @Override
    public void batchSaveMallGoods(List<MallGoods> mallGoodsList) {
        if (!CollectionUtils.isEmpty(mallGoodsList)) {
            goodsMapper.batchInsert(mallGoodsList);
        }
    }

    @Override
    public String updateMallGoods(MallGoods goods) {
        MallGoods temp = goodsMapper.selectByPrimaryKey(goods.getGoodsId());
        if (temp == null) {
            return ServiceResultEnum.DATA_NOT_EXIST.getResult();
        }
        goods.setUpdateTime(new Date());
        if (goodsMapper.updateByPrimaryKeySelective(goods) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    @Override
    public MallGoods getMallGoodsById(Long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }
    
    @Override
    public Boolean batchUpdateSellStatus(Long[] ids, int sellStatus) {
        return goodsMapper.batchUpdateSellStatus(ids, sellStatus) > 0;
    }

    @Override
    public PageResult searchMallGoods(PageQueryUtil pageUtil) {
        List<MallGoods> goodsList = goodsMapper.findNewBeeMallGoodsListBySearch(pageUtil);
        int total = goodsMapper.getTotalNewBeeMallGoodsBySearch(pageUtil);
        List<MallSearchGoodsVO> mallSearchGoodsVOS = new ArrayList<>();
        if (!CollectionUtils.isEmpty(goodsList)) {
            mallSearchGoodsVOS = BeanUtil.copyList(goodsList, MallSearchGoodsVO.class);
            for (MallSearchGoodsVO mallSearchGoodsVO : mallSearchGoodsVOS) {
                String goodsName = mallSearchGoodsVO.getGoodsName();
                String goodsIntro = mallSearchGoodsVO.getGoodsIntro();
                // 字符串过长导致文字超出的问题
                if (goodsName.length() > 28) {
                    goodsName = goodsName.substring(0, 28) + "...";
                    mallSearchGoodsVO.setGoodsName(goodsName);
                }
                if (goodsIntro.length() > 30) {
                    goodsIntro = goodsIntro.substring(0, 30) + "...";
                    mallSearchGoodsVO.setGoodsIntro(goodsIntro);
                }
            }
        }
        PageResult pageResult = new PageResult(mallSearchGoodsVOS, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }
}
