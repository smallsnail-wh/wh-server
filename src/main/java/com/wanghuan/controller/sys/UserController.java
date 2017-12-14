package com.wanghuan.controller.sys;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wanghuan.model.sys.UserEntity;
import com.wanghuan.service.sys.UserService;

@RestController
public class UserController {
	
	private Logger log = LoggerFactory.getLogger(UserController.class);
		
	@Resource(name = "userServiceImpl")
	private UserService userService;
	
	@GetMapping("/user/{loginName}")
	public UserEntity userGet(@PathVariable String loginName){
		UserEntity userEntity = userService.getUserEntityByLoginName(loginName);
		return userEntity;
	}
}
