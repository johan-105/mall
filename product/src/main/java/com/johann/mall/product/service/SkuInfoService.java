package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

