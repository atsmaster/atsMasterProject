/*
 * package com.sam.ats.web;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.sam.ats.service.LoginService; import
 * com.sam.ats.vo.EnterpriseMemberVo;
 * 
 * @RestController public class TestController {
 * 
 * @Autowired LoginService loginService;
 * 
 * @RequestMapping(value="/member") public @ResponseBody
 * List<EnterpriseMemberVo> selectListEnterpriseMember(
 * 
 * @ModelAttribute("searchVo") EnterpriseMemberVo enterpriseMemberVo, ModelMap
 * model) throws Exception{ List<EnterpriseMemberVo> mList =
 * loginService.selectListEnterpriseMember(enterpriseMemberVo);
 * 
 * return mList; } }
 */