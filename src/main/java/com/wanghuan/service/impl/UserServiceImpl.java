package com.wanghuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanghuan.dao.UserDao;
import com.wanghuan.model.UserEntity;
import com.wanghuan.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void insert(UserEntity userEntity) {
		userDao.insert(userEntity);
	}

	@Override
	public void del(UserEntity userEntity) {
		userDao.del(userEntity);
	}

}
