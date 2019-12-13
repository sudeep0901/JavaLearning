package com.sudeep.hibernate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Target;

@Entity(name="City")
public class City {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	@Embedded
	@Target(GPS.class)
	private Coordinates coordinates;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the coordinates
	 */
	public Coordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
}
