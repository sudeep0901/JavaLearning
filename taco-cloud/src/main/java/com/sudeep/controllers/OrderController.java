package com.sudeep.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sudeep.domain.Order;
import com.sudeep.repository.OrderRepository;
import com.sudeep.security.User;
import com.sudeep.security.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {

	private UserRepository userRepo;
	private OrderRepository orderRepo;

	public OrderController(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}

	@GetMapping("/current")
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "orderForm";
	}

	@PostMapping
	public String processOrder(@Valid Order order, Errors errors, SessionStatus sessionStatus, Principal principal,
			Authentication authentication, @AuthenticationPrincipal User user) {
		if (errors.hasErrors()) {
			System.err.println(errors);
			return "orderForm";
		}

//		System.err.println(user);

//		User user = (User) authehtication.getPrincipal();
//		User user = userRepo.findByUsername(principal.getName());
		
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		User user = (User) authentication.getPrincipal();

		System.err.println(authentication);
		
		order.setUser(user);
		System.err.println(user);

		orderRepo.save(order);
		sessionStatus.setComplete();
		System.err.println(sessionStatus);

		log.info("Order submitted: " + order);
		return "redirect:/";
	}
}
