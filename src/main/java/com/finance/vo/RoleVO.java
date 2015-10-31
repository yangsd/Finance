package com.finance.vo;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.GrantedAuthority;

/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:42:17
 */
public class RoleVO implements GrantedAuthority, ConfigAttribute {

	private int pk_role;

	private String role_code;

	private String role_name;

	private String enable;

	private int access;

	private String dr;

	public int getPk_role() {
		return pk_role;
	}

	public void setPk_role(int pk_role) {
		this.pk_role = pk_role;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
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

	public String getAttribute() {
		return this.role_code;
	}

	public String getAuthority() {
		return this.role_code;
	}

}
