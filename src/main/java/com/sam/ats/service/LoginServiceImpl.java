package com.sam.ats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sam.ats.dao.LoginDao;
import com.sam.ats.vo.EnterpriseMemberVo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public List<EnterpriseMemberVo> selectListEnterpriseMember(EnterpriseMemberVo vo)  throws Exception{
		return loginDao.selectListEnterpriseMember(vo);
	}
}
