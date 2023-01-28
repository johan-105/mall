package com.johann.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:07:22
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

