package com.sam.ats.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.ats.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class AtsController {
	@Autowired
	LoginService loginService;
	
	@Value("${say.hello}")
	String hello;
	
	@RequestMapping(value="/")
	public String idex(Model model) throws Exception{
		System.out.println("시작");
		model.addAttribute("hello", hello);
		
		return "index";
	}
	
	
}
