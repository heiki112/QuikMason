package com.quikmason.common;

import java.util.Set;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for welcome page
 */
@Controller
public class MainController {

	@RequestMapping(value = { "/", "/main" })
	public String main() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
  Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
  if (roles.contains("ROLE_USER")) {
      return "main";
  }
  return "landing";
	}

	@RequestMapping("/*")
	public void defaultRequest() {
	}

}
