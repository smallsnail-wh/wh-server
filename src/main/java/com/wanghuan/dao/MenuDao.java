package com.wanghuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.wanghuan.model.sys.MenuEntity;

@Mapper
public interface MenuDao {

	/**
	 * 通过用户Id得到一级菜单List
	 * 
	 * @param id
	 * @return
	 */
	public List<MenuEntity> getParentMenuListById(@Param("ids") String[] ids);

	public List<MenuEntity> getMenuListById(@Param("ids") String[] ids);

	public List<String> getMenuIdByRole(@Param("id") int id);

	/**
	 * 获取menus列表
	 * 
	 * @param loginName
	 * @param pageSize
	 * @param i
	 * @return
	 */
	public List<MenuEntity> menusList(@Param("pageSize") int pageSize, @Param("start") int start);

	/**
	 * 获取menus列表的总量
	 * 
	 * @param loginName
	 * @param pageSize
	 * @param i
	 * @return
	 */
	public Integer menusSize(@Param("pageSize") int pageSize, @Param("start") int start);

	/**
	 * 新建菜单信息
	 * 
	 * @param menuEntity
	 */
	public void insertMenu(@Param("menuEntity") MenuEntity menuEntity);

	/**
	 * 修改菜单信息
	 * 
	 * @param menuEntity
	 */
	public void updateMenu(@Param("menuEntity") MenuEntity menuEntity);

	/**
	 * 删除菜单信息
	 * 
	 * @param groupId
	 */
	public void deleteMenus(@Param("groupId") List<String> groupId);

}
