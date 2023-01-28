package com.johann.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:07:22
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

