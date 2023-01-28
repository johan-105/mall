package com.johann.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:57:42
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

