package com.sudeep.hibernate.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="AssociationPersonOneToMany")
public class Person {
	
	@Id
	@GeneratedValue
	@Column(name="person_id")
	private Long Id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Phone> phone =  new ArrayList<Phone>();

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
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
	 * @return the phone
	 */
	public List<Phone> getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	 
	
}
