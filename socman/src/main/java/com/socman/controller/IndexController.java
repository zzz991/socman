package com.socman.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping("/index")
	public String welcome(){
		logger.debug("[welcome] ");
		return VIEW_INDEX;
	}

}
