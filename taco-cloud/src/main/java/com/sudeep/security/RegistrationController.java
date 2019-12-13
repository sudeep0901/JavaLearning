package com.sudeep.security;

 
 import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	private UserRepository userRepo;
	private PasswordEncoder passEncoder;

	public RegistrationController(UserRepository userRepo, PasswordEncoder passEncoder) {

		this.userRepo = userRepo;
		this.passEncoder = passEncoder;
	}

	@GetMapping
	public String registerForm() {
		return "registration";

	}

	@PostMapping
	public String processRegistration(RegistrationForm form) {
		userRepo.save(form.toUser(passEncoder));
		System.err.println(form);
		return "redirect:/login";
	}
	
	
	

}
