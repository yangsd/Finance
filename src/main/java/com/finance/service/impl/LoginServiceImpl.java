package com.finance.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.finance.dao.UrlDao;
import com.finance.exception.BusinessException;
import com.finance.service.LoginService;
import com.finance.vo.UrlVO;
import com.finance.vo.UserVO;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UrlDao dao;

	public String getMenuByRole() throws BusinessException {

		StringBuffer menu = new StringBuffer();

		UserVO user = (UserVO) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if(user.getRoleList()== null||user.getRoleList().size()==0){
			throw new BusinessException("用户没有分配角色！");
		}
		
		String role = user.getRoleList().get(0).getPk_role()+"";
		List<UrlVO> urls = null;

		try {
			urls = dao.getUrlByRole(role);
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		if (urls == null || urls.size() == 0) {
			throw new BusinessException("用户没有访问权限！");
		}

		Map<Integer, List<UrlVO>> urlMap = new HashMap<Integer, List<UrlVO>>();
		for (UrlVO url : urls) {
			// 如果Map里已经包含了key，则增加url
			if (urlMap.containsKey(url.getParent_id())) {
				List<UrlVO> l = urlMap.get(url.getParent_id());
				l.add(url);
				urlMap.put(url.getParent_id(), l);
			} else {
				// 否则新增一个list,新增一个key
				List<UrlVO> l = new ArrayList<UrlVO>();
				l.add(url);
				urlMap.put(url.getParent_id(), l);
			}
		}

		menu.append("<ul class=\"page-sidebar-menu\" data-keep-expanded=\"false\" data-auto-scroll=\"true\" data-slide-speed=\"200\">");
		menu.append("<li class=\"sidebar-toggler-wrapper\">");
		menu.append("<div class=\"sidebar-toggler\">");
		menu.append("</div>");
		menu.append("</li>");
		menu.append("<li class=\"sidebar-search-wrapper\">");
		menu.append("<form class=\"sidebar-search \" action=\"extra_search.html\" method=\"POST\">");
		menu.append("<a href=\"javascript:;\" class=\"remove\">");
		menu.append("<i class=\"icon-close\"></i>");
		menu.append("</a>");
		menu.append("<div class=\"input-group\">");
		menu.append("<input type=\"text\" class=\"form-control\" placeholder=\"Search...\">");
		menu.append("<span class=\"input-group-btn\">");
		menu.append("<a href=\"javascript:;\" class=\"btn submit\"><i class=\"icon-magnifier\"></i></a>");
		menu.append("</span>");
		menu.append("</div>");
		menu.append("</form>");
		menu.append("</li>");

		//key为0为所有的父菜单
		List<UrlVO> parentUrl = urlMap.get(0);
		if (parentUrl != null && parentUrl.size() > 0) {
			for(UrlVO p:parentUrl){
				
				if (urlMap.containsKey(p.getPk_url())) {
					menu.append("<li ");
					
					if(p.getActive().equals("Y")){
						menu.append("class=\" active open\"");
					}
					
					menu.append("><a href=\"javascript:;\"><i class=\""+ p.getIcon() + "\"></i>");
					menu.append("<span class=\"title\">" + p.getName()+ "</span>");
					
					if(p.getActive().equals("Y")){
						menu.append("<span class=\"selected\"></span><span class=\"arrow\"></span>");
					}
					menu.append("</a>");
					
					//子菜单
					this.getSubMenu(p.getPk_url(),urlMap,menu);
										
					menu.append("</li>");
				}else{
					//父菜单是一个链接，没有子菜单
					if(p.getUrl() != null){
						menu.append("<li ");
						
						if(p.getActive().equals("Y")){
							menu.append("class=\" active open\"");
						}
						
						menu.append("><a href=\"javascript:;\"><i class=\""+ p.getIcon() + "\"></i>");
						menu.append("<span class=\"title\">" + p.getName()+ "</span>");
						
						if(p.getActive().equals("Y")){
							menu.append("<span class=\"selected\"></span><span class=\"arrow\"></span>");
						}
						menu.append("</a>");
											
						menu.append("</li>");
					}
				}
			}
		}
		menu.append("</ul>");
		return menu.toString();
	}
	
	/**
	 * 组织子菜单
	 * @param pk_url
	 * @param urlMap
	 * @param menu
	 * @author sdyang
	 * @date   2015年8月15日 下午12:15:08
	 */
	private void getSubMenu(Integer pk_url, Map<Integer, List<UrlVO>> urlMap,
			StringBuffer menu) {
		
		menu.append("<ul class=\"sub-menu\">");

		List<UrlVO> urlList = urlMap.get(pk_url);
		for (UrlVO url : urlList) {
			if (urlMap.containsKey(url.getPk_url())) {
				getSubMenu(url.getPk_url(), urlMap, menu);
			} else {
				if (url.getUrl() != null) {
					menu.append("<li><a href=\""+url.getUrl()+"\"><i class=\""+url.getIcon()+"\"></i>"+url.getName()+"</a></li>");
				}
			}
		}

		menu.append("</ul>");
	}
	

}
