package com.quikmason.user;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Service to get user information for a security context
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Resource
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.loadUserByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Not found");
		}
		
		return new UserPrincipal(user);
	}

}
