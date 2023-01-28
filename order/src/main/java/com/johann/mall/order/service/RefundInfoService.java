package com.johann.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:46:28
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

