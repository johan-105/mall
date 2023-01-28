package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

