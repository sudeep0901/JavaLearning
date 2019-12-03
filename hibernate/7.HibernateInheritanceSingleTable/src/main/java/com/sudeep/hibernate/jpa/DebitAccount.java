package com.sudeep.hibernate.jpa;

 
import javax.persistence.Entity;

@Entity(name="DebitAccount")
public class DebitAccount extends Account {

	private double overdraftFee;

	/**
	 * @return the overdraftFee
	 */
	public double getOverdraftFee() {
		return overdraftFee;
	}

	/**
	 * @param i the overdraftFee to set
	 */
	public void setOverdraftFee(int i) {
		this.overdraftFee = i;
	}
	
}
