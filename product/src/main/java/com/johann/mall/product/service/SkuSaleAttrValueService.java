package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

