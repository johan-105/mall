package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

