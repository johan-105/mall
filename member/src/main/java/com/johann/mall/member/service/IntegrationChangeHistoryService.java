package com.johann.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:57:42
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

