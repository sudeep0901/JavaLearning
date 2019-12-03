package com.sudeep.hibernate.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "JoinedCreditAccount")
@DiscriminatorValue(value="Credit")
public class CreditAccount extends Account {

	private int creditLimit;
	private String creditKey;

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

	/**
	 * @return the creditKey
	 */
	public String getCreditKey() {
		return creditKey;
	}

	/**
	 * @param creditKey the creditKey to set
	 */
	public void setCreditKey(String creditKey) {
		this.creditKey = creditKey;
	}

}
