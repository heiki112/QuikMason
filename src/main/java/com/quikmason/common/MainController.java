package com.quikmason.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for welcome page
 */
@Controller
public class MainController {

	@RequestMapping(value = { "/", "/main" })
	public String main() {
		return "main";
	}

	@RequestMapping("/*")
	public void defaultRequest() {
	}

}
