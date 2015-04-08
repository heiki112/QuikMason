package com.quikmason.user;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Convenience methods for {@link User} objects
 */
public class UserUtil {

	/**
	 * Gets the logged in user for the current session
	 * 
	 * @return User
	 */
	public static User getCurrentUser() {
		UserPrincipal principal = (UserPrincipal) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		return principal.getUser();
	}
}
