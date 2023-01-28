package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

