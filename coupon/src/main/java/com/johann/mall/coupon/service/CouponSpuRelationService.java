package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

