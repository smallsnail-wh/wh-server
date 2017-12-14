package com.wanghuan.service.sys;

import com.wanghuan.model.sys.UserEntity;

public interface UserService {
	public void insert(UserEntity userEntity);

	public void del(UserEntity userEntity);

	/**
	 * 通过登录名得到用户信息
	 * @param loginName
	 * @return
	 */
	public UserEntity getUserEntityByLoginName(String loginName);
}
