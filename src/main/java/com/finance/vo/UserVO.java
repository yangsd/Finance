package com.finance.vo;

import java.util.List;

/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:31:05
 */

public class UserVO {

	private int pk_user;

	private String loginid;

	private String name;

	private String password;

	private Integer access;

	private RoleVO role;

	private String creatime;

	private String modifytime;

	private String enable;

	private String dr;

	private List<RoleVO> roleList;

	public UserVO() {

	}

	public int getPk_user() {
		return pk_user;
	}

	public void setPk_user(int pk_user) {
		this.pk_user = pk_user;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
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

	public Integer getAccess() {
		return access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

	public RoleVO getRole() {
		return role;
	}

	public void setRole(RoleVO role) {
		this.role = role;
	}

	public String getCreatime() {
		return creatime;
	}

	public void setCreatime(String creatime) {
		this.creatime = creatime;
	}

	public String getModifytime() {
		return modifytime;
	}

	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public List<RoleVO> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleVO> roleList) {
		this.roleList = roleList;
	}

}
