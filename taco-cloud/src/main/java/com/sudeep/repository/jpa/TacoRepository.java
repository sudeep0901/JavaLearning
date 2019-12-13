package com.sudeep.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.sudeep.domain.Ingredient;
import com.sudeep.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>{
	
	
}
