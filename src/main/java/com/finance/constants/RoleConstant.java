package com.finance.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:50:25
 */
public interface RoleConstant {

	public static String ROLE_ADMIN = "ROLE_ADMIN";

	public static String ROLE_USER = "ROLE_USER";

	public static Map<Integer, String> ACCESS = new HashMap<Integer, String>() {
		{
			put(1, "admin");
			put(2, "user");
		}
	};

}
