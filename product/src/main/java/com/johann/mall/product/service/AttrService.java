package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.AttrEntity;
import com.johann.mall.product.vo.AttrRespVo;
import com.johann.mall.product.vo.AttrVo;

import java.util.Map;

/**
 * 商品属性
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttrVo(AttrVo attrVo);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    AttrRespVo getAttrRespVo(Long attrId);

    void updateAttr(AttrVo attr);
}

