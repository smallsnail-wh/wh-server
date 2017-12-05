package com.wanghuan.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.wanghuan.dao.UserDao;

@Component
public class MyUserDetailsService implements UserDetailsService {
	Logger log = LoggerFactory.getLogger(MyUserDetailsService.class);
	
	@Autowired
	UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String password = userDao.getPawByLoginName(username);
		log.info(password);
		return new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
	}

}
