package com.johann.mall.member.dao;

import com.johann.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author johann
 * @email 
 * @date 2023-01-28 19:57:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
