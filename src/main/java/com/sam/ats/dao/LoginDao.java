/*
 * package com.sam.ats.dao;
 * 
 * import java.util.List;
 * 
 * import org.apache.ibatis.annotations.Mapper; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.sam.ats.vo.EnterpriseMemberVo; import com.sam.util.AbstractDAO;
 * 
 * @Mapper
 * 
 * @Repository("LoginDao") public class LoginDao extends AbstractDAO{
 * 
 * 
 * // public List<EnterpriseMemberVo>
 * selectListEnterpriseMember(EnterpriseMemberVo vo) throws Exception;
 * 
 * public List<EnterpriseMemberVo> selectListEnterpriseMember(EnterpriseMemberVo
 * vo) throws Exception { return
 * selectList("com.sam.ats.dao.LoginDao.selectListEnterpriseMember", vo); }
 * 
 * }
 */