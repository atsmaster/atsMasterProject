package com.sam.ats.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class StartController {
	
	@Value("${say.hello}")
	private String gg;
	
	@RequestMapping(value="/")
	public String index(Model model) throws Exception {
		model.addAttribute("gg", gg);
		return "index";
	}
	
}
