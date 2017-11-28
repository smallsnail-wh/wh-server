package com.wanghuan.controller.sys;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wanghuan.model.sys.MenuEntity;
import com.wanghuan.service.sys.MenuService;

@RestController
public class MenuController {
	
	private Logger log = LoggerFactory.getLogger(MenuController.class);
	
	@Resource(name = "menuServiceImpl")
	private MenuService menuService;
	
	@GetMapping("/menu/{id}")
	public List<MenuEntity> menuList(@PathVariable int id){
		List<MenuEntity> menuList = menuService.menuList(id);
		return menuList;
	}
}
