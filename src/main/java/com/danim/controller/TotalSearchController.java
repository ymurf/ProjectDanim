package com.danim.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TotalSearchController {
	private static final Logger logger = LoggerFactory.getLogger(TotalSearchController.class);
	
	@RequestMapping(value="totalSearch", method=RequestMethod.GET)
	public void totalSearch() {
		logger.info("totalSearch 페이지 진입");
	}

}
