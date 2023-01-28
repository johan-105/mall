package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

