package com.sudeep.controllers;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sudeep.domain.Ingredient;
import com.sudeep.domain.Taco;
import com.sudeep.domain.Ingredient.Type;
import com.sudeep.domain.Order;
import com.sudeep.repository.IngredientRepository;
import com.sudeep.repository.TacoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")

public class DesignTacoController {

	private final IngredientRepository ingredientRepository;
	private TacoRepository designRepo;

	@ModelAttribute(name = "order")
	public Order order() {
		return new Order();
	}

	@ModelAttribute(name = "taco")
	public Taco taco() {
		return new Taco();
	}

	@Autowired
	public DesignTacoController(IngredientRepository ingredientRepository,   TacoRepository designRepo) {
		super();
		this.ingredientRepository = ingredientRepository;
		this.designRepo = designRepo;
	}

	@PostMapping
	public String processDesign(@Valid Taco design, Errors errors, @ModelAttribute Order order ) {
//		design.setCreatedAt(new Date().getDate());
		System.err.println(design);
//	    model.addAttribute("design", new Taco());
		System.err.println(design.getIngredients());
		System.err.println(errors);
		if (errors.hasErrors()) {
			System.err.println("Error in design model");
			return "design";
		}
		
		Taco saved = designRepo.save(design);
		order.addDesign(saved);
		// Save the taco design...
		// We'll do this in chapter 3
		log.info("Processing design: " + design);
		return "redirect:/orders/current";
	}

	@GetMapping
	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = new ArrayList<>();
		ingredientRepository.findAll().forEach(i -> ingredients.add(i));

		// List<Ingredient> ingredients = Arrays.asList(new Ingredient("FLTO", "Flour
		// Tortilla", Type.WRAP),
//				new Ingredient("COTO", "Corn Tortilla", Type.WRAP), new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
//				new Ingredient("CARN", "Carnitas", Type.PROTEIN),
//				new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES), new Ingredient("LETC", "Lettuce", Type.VEGGIES),
//				new Ingredient("CHED", "Cheddar", Type.CHEESE), new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
//				new Ingredient("SLSA", "Salsa", Type.SAUCE), new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
		Type[] types = Ingredient.Type.values();
//
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}

		model.addAttribute("design", new Taco());
//		model.addAttribute("order", new Order());
		return "design";
	}

	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
		return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
	}
}
