package com.admindashboard.sidebar.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {
	
	@RequestMapping("/login")
	public String loginPage() {
		return "auth-login";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "/pages/landingpage";
	}
	
	@RequestMapping("/forget")
	public String forgetPass() {
		return "/pages/auth-forgot-password";
	}

}
