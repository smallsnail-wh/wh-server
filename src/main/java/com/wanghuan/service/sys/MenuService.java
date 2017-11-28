package com.wanghuan.service.sys;

import java.util.List;

import com.wanghuan.model.sys.MenuEntity;

public interface MenuService {

	/**
	 * 得到菜单List
	 * @param id
	 * @return
	 */
	List<MenuEntity> menuList(int id);

}
