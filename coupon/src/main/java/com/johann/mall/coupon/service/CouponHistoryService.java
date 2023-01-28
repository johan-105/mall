package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

