package com.finance.security;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class SimpleLoginSuccessHandler implements AuthenticationSuccessHandler,
		InitializingBean {

	private String defaultTargetUrl;

	private boolean forwardToDestination = false;

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	public void afterPropertiesSet() throws Exception {

	}

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		 Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
	        //String path = request.getContextPath() ;
	        //String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
	        if (roles.contains("ROLE_ADMIN")){
	        	this.redirectStrategy.sendRedirect(request, response,
						"/home");
	        	return;
	        }
	        this.redirectStrategy.sendRedirect(request, response,
					this.defaultTargetUrl);        
	    /*
	
		if (this.forwardToDestination) {
			request.getRequestDispatcher(this.defaultTargetUrl).forward(
					request, response);
		} else {
			this.redirectStrategy.sendRedirect(request, response,
					this.defaultTargetUrl);
		}
	*/
	}

	public void setDefaultTargetUrl(String defaultTargetUrl) {
		this.defaultTargetUrl = defaultTargetUrl;
	}

	public void setForwardToDestination(boolean forwardToDestination) {
		this.forwardToDestination = forwardToDestination;
	}

}
