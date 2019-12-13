package com.sudeep.hibernate.jpa;

import javax.persistence.Entity;

@Entity(name = "CreditAccount")
public class CreditAccount extends Account {

	private int creditLimit;

	/**
	 * @return the creditLimit
	 */
	public int getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param i the creditLimit to set
	 */
	public void setCreditLimit(int i) {
		this.creditLimit = i;
	}

}
