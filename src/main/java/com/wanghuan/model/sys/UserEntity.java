package com.wanghuan.model.sys;

/**
 * @author wanghuan
 *
 */
public class UserEntity {
	/**
	 * id
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String loginName;
	/**
	 * 登录名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 邮箱
	 */
	private String email;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", loginName=" + loginName + ", name=" + name + ", password=" + password
				+ ", email=" + email + "]";
	}

}
