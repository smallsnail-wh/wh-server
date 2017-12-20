package com.wanghuan.model.sys;

/**
 * @author wanghuan
 *
 */
public class RoleEntity {
	/**
	 * id
	 */
	private int id;
	/**
	 * 角色
	 */
	private String name;
	/**
	 * 权限
	 */
	private String modules;
	/**
	 * 描述
	 */
	private String describe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", name=" + name + ", modules=" + modules + ", describe=" + describe + "]";
	}

}
