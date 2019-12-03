package com.sudeep.hibernate.jpa;

 
import javax.persistence.Entity;

@Entity(name="TablePerClassDormentAccount")
public class DormentAccount extends Account {

	private boolean dorment;

	/**
	 * @return the dorment
	 */
	public boolean isDorment() {
		return dorment;
	}

	/**
	 * @param dorment the dorment to set
	 */
	public void setDorment(boolean dorment) {
		this.dorment = dorment;
	}

	 
}
