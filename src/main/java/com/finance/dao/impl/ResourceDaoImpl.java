package com.finance.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.constants.RoleConstant;
import com.finance.constants.UrlConstant;
import com.finance.dao.ResourceDao;

@Transactional
@Service("ResourceDao")
public class ResourceDaoImpl implements ResourceDao {

	public Map<String, String> getResources() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(UrlConstant.ADMIN, RoleConstant.ROLE_ADMIN);
		map.put(UrlConstant.HOME, RoleConstant.ROLE_USER);
		return map;
	}
}
