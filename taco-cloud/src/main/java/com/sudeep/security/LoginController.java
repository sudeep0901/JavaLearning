package com.sudeep.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	
	@PostMapping
	public String authenticate() {
		return "design";
	}
}
