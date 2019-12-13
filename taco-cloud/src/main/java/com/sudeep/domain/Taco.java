package com.sudeep.domain;

import java.lang.annotation.Documented;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity

public class Taco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;

	@ManyToMany(targetEntity = Ingredient.class)
	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private List<String> ingredients;

	private Date createdAt;

//	@PrePersist. You’ll use this to set the createdAt property to the current date and
//	time before Taco is persisted.
	@PrePersist
	 
	void createdAt() {
		this.createdAt = new Date();

	}
}
