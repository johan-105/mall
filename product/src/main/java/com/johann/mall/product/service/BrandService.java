package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

