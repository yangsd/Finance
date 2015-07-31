package com.finance.login;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:27:51
 */
public class SingleOnline {

	
	public static final String ENFORCE = "enforce";

	private static Map<String, String> mapOnline = new ConcurrentHashMap<String, String>();

	
	public static void addUser(String userName, String sessionId) {
		mapOnline.put(userName, sessionId);
	}

	
	public static void removeUser(String userName) {
		mapOnline.remove(userName);
	}

	
	public static boolean isOnline(String userName) {
		if (mapOnline.containsKey(userName)) {
			return true;
		} else {
			return false;
		}
	}

	
	public static boolean isSessionValid(String sessionId) {
		boolean flag = false;
		if (mapOnline.containsValue(sessionId)) {
			flag = true;
		}
		return flag;
	}

	
	public static void purge() {
		mapOnline.clear();
	}
}
