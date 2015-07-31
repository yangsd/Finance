package com.finance.login;

import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:27:29
 */
public class AuthenticationToken extends UsernamePasswordAuthenticationToken {

	private String verificationCode;

	private HttpSession session;

	public AuthenticationToken(Object principal, Object credentials,
			String verificationCode, HttpSession session) {
		super(principal, credentials);
		this.verificationCode = verificationCode;
		this.session = session;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

}
