package com.finance.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.finance.constants.RoleConstant;
import com.finance.dao.UserDao;
import com.finance.exception.BusinessException;
import com.finance.vo.UserVO;



/**
 * 
 * @author sdyang
 * @date 2015年7月31日 上午9:24:37
 */
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDao userDao;

	public UserDetails loadUserByUsername(String loginId)
			throws UsernameNotFoundException {
		UserVO userVO = null;
		try {
			userVO = userDao.getUserAndRoleByLoginId(loginId);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		return userVO;
	}

	public Collection<GrantedAuthority> getAuthorities(Integer access) {

		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);

		
		authList.add(new SimpleGrantedAuthority(RoleConstant.ROLE_USER));

		
		if (access.compareTo(1) == 0) {
			authList.add(new SimpleGrantedAuthority(RoleConstant.ROLE_ADMIN));
		}

		return authList;
	}

}
