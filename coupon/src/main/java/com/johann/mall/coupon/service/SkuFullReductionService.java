package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

