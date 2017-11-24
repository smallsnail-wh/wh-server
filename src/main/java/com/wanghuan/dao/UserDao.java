package com.wanghuan.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wanghuan.model.UserEntity;

@Mapper
public interface UserDao {

	public ArrayList<UserEntity> select(@Param("userEntity") UserEntity userEntity);
	
	public void del(@Param("userEntity") UserEntity userEntity);
	
	public void update(@Param("userEntity") UserEntity userEntity);
	
	public void insert(@Param("userEntity") UserEntity userEntity);
	
	/**
	 * 通过登录名拿到密码
	 * @return
	 */
	public String getPawByLoginName(@Param("loginName") String loginName);
	
}
