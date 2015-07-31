package com.finance.vo;
/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:42:17
 */
public class RoleVO {

	private int pk_role;
	
	private String role;
	
	private String desc;
	
	private String enable;
	
	private int access;
	
	private String dr;

	public int getPk_role() {
		return pk_role;
	}

	public void setPk_role(int pk_role) {
		this.pk_role = pk_role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public int getAccess() {
		return access;
	}

	public void setAccess(int access) {
		this.access = access;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr;
	}

}
