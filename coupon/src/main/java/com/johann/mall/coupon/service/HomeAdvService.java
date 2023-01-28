package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

