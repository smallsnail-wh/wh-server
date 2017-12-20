package com.wanghuan.model.sys;

/**
 * @author wanghuan
 *
 */
public class RelationEntity {
	/**
	 * 用户ID
	 */
	private int userId;
	/**
	 * 角色ID
	 */
	private int roleId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "RelationEntity [userId=" + userId + ", roleId=" + roleId + "]";
	}
}
