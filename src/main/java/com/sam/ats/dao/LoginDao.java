package com.sam.ats.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sam.ats.vo.EnterpriseMemberVo;

@Mapper
public interface LoginDao {
	
	public List<EnterpriseMemberVo> selectListEnterpriseMember(EnterpriseMemberVo enterpriseMemberVo) throws Exception;
	
}
