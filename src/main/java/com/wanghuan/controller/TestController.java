package com.wanghuan.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wanghuan.model.UserEntity;
import com.wanghuan.service.UserService;

@RestController
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	@Resource(name = "userService")
	private UserService userService;
	
	@PostMapping(value = "/user")
	String insert(@RequestBody UserEntity userEntity) {
		log.info("insert");
		userService.insert(userEntity);
		return "SUCCESS";
	}
	@DeleteMapping(value = "/user")
	String del(@RequestBody UserEntity userEntity) {
		log.info("del");
		userService.del(userEntity);
		return "SUCCESS";
	}
	@PutMapping(value = "/user")
	String update() {
		log.info("update");
		
		return "SUCCESS";
	}
	
	@GetMapping(value = "/user")
	String select(@RequestParam("id") int id) {
		log.info(id+"");
		return "SUCCESS";
	}
	
	@GetMapping(value = "/test")
	String test() {
		return "SUCCESS";
	}
}
