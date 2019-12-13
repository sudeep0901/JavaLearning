package com.sudeep.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.sudeep.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{

}
