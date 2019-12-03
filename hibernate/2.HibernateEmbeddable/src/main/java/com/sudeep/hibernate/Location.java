package com.sudeep.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class Location {
	
	
	private String country;

	public Location(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}

	private String city;

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
}
