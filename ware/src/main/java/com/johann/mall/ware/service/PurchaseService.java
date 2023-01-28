package com.johann.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:07:22
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

