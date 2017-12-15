package com.wanghuan.controller.sys;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wanghuan.model.sys.MenuEntity;
import com.wanghuan.model.sys.PageResult;
import com.wanghuan.model.sys.UserEntity;
import com.wanghuan.service.sys.MenuService;
import com.wanghuan.service.sys.UserService;

@RestController
public class MenuController {

	private Logger log = LoggerFactory.getLogger(MenuController.class);

	@Resource(name = "menuServiceImpl")
	private MenuService menuService;

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@GetMapping("/menu/{loginName}")
	public List<MenuEntity> menuList(@PathVariable String loginName) {
		UserEntity userEntity = userService.getUserEntityByLoginName(loginName);
		List<MenuEntity> menuList = menuService.menuList(userEntity.getId());
		return menuList;
	}

	@GetMapping("/menus")
	public PageResult menusList(int pageSize, int page) {
		PageResult pageResult = new PageResult();
		pageResult.setData(menuService.menusList(pageSize, page * pageSize));
		pageResult.setTotalCount(menuService.menusSize(pageSize, page * pageSize));
		log.debug("The method is ending");
		return pageResult;
	}

	@PostMapping("/menus/user")
	public MenuEntity insertMenu(@RequestBody MenuEntity menuEntity) {
		menuService.insertMenu(menuEntity);
		log.debug("The method is ending");
		return menuEntity;
	}

	@PutMapping("/menus/{id}")
	public MenuEntity updateMenu(@RequestBody MenuEntity menuEntity, @PathVariable int id) {
		if (menuEntity.getId() == id) {
			menuService.updateMenu(menuEntity);
		}
		log.debug("The method is ending");
		return menuEntity;
	}

	@DeleteMapping("/menus")
	public List<String> deleteMenus(@RequestBody List<String> groupId) {
		menuService.deleteMenus(groupId);
		return groupId;
	}
}
