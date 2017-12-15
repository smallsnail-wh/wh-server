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

	/**
	 * 获取menus列表
	 * @param pageSize
	 * @param i
	 * @return
	 */
	List<MenuEntity> menusList(int pageSize, int start);

	/**
	 * 获取menus列表的总量
	 * @param loginName
	 * @param pageSize
	 * @param i
	 * @return
	 */
	Integer menusSize(int pageSize, int start);

	/**
	 * 新建菜单信息
	 * @param menuEntity
	 */
	void insertMenu(MenuEntity menuEntity);

	/**
	 * 修改菜单信息
	 * @param menuEntity
	 */
	void updateMenu(MenuEntity menuEntity);

	/**
	 * 删除菜单信息
	 * @param groupId
	 */
	void deleteMenus(List<String> groupId);

}
