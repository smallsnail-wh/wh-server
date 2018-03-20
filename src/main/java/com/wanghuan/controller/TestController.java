package com.wanghuan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/jwttest")
	public Object jwtTest(Authentication user) {
		return user;
	}
	
}
