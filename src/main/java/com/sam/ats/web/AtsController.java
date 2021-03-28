package com.sam.ats.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AtsController {
	@RequestMapping(value="/")
	public String idex(Model model) throws Exception{
		System.out.println("시작");
		return "index";
	}
}
