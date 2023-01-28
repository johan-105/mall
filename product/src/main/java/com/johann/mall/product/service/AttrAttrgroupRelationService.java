package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

