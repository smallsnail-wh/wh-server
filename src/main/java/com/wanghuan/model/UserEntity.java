package com.wanghuan.model;

/**
 * @author wanghuan
 *
 */
public class UserEntity {
	private int id;
	private String loginName;
	private String name;
	private String passwrod;
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

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
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
		return "UserEntity [id=" + id + ", loginName=" + loginName + ", name=" + name + ", passwrod=" + passwrod
				+ ", email=" + email + "]";
	}

}
