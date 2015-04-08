package com.quikmason.user;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;


@Controller
@RequestMapping(value = "/user")
public class UserController {
  
  @Resource
  private UserService userservice;
  
  private static Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String showRegistrationForm(WebRequest request, Model model) {
	    User user = new User();
	    model.addAttribute("user", user);
	    return "registration";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
  public void saveUser(@RequestBody final User user) {
	  userservice.save(user);
  }
}
