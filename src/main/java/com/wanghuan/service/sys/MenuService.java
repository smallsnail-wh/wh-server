package com.wanghuan.service.sys;

import java.util.List;

import com.wanghuan.model.sys.MenuEntity;
import com.wanghuan.model.sys.UserEntity;

public interface MenuService {

	/**
	 * 得到菜单List
	 * 
	 * @param id
	 * @return
	 */
	List<MenuEntity> menuList(int id);

}
