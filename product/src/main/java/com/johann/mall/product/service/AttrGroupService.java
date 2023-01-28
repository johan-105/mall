package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

