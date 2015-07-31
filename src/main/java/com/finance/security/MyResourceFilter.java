package com.finance.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import com.finance.dao.impl.ResourceDaoImpl;


/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:25:03
 */
public class MyResourceFilter implements FilterInvocationSecurityMetadataSource {

	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;

	private PathMatcher pathMatcher = new AntPathMatcher();

	private ResourceDaoImpl resourceDao;

	public MyResourceFilter() {
		super();
		this.resourceDao = new ResourceDaoImpl();
		resourceMap = loadResourceMatchAuthority();
	}

	public MyResourceFilter(ResourceDaoImpl resourceDao) {
		this.resourceDao = resourceDao;
		resourceMap = loadResourceMatchAuthority();
	}

	private Map<String, Collection<ConfigAttribute>> loadResourceMatchAuthority() {

		Map<String, Collection<ConfigAttribute>> map = new HashMap<String, Collection<ConfigAttribute>>();

		
		Map<String, String> configs = resourceDao.getResources();
		for (Entry<String, String> entry : configs.entrySet()) {
			Collection<ConfigAttribute> list = new ArrayList<ConfigAttribute>();

			String[] vals = entry.getValue().split(",");
			for (String val : vals) {
				ConfigAttribute config = new SecurityConfig(val);
				list.add(config);
			}
			map.put(entry.getKey(), list);
		}

		return map;

	}

	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		String url = ((FilterInvocation) object).getRequestUrl();

		if (resourceMap == null) {
			loadResourceMatchAuthority();
		}
		
		
        int firstQuestionMarkIndex = url.indexOf("?");
        if (firstQuestionMarkIndex != -1) {
            url = url.substring(0, firstQuestionMarkIndex);
        }
        
		if (url.endsWith(".js") || url.endsWith(".jpg") || url.endsWith(".png")
				|| url.endsWith(".css") || url.endsWith(".gif")
				|| url.endsWith(".woff") || url.endsWith(".ttf")) {
			return null;
		}
        
        System.out.println("request url:" + url);
        
		
		Iterator<String> ite = resourceMap.keySet().iterator();
		while (ite.hasNext()) {
			String resURL = ite.next();
			if (pathMatcher.match(resURL, url)) {
				return resourceMap.get(resURL);
			}
		}
		return resourceMap.get(url);
	}

	public boolean supports(Class<?> clazz) {
		return true;
	}

}
