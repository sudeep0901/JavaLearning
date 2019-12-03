package com.sudeep.hibernate.jpa;

 
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="DebitAccount")
@DiscriminatorValue(value="Debit")
public class DebitAccount extends Account {

	private double overdraftFee;
	private String debitKey;

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

	/**
	 * @return the debitKey
	 */
	public String getDebitKey() {
		return debitKey;
	}

	/**
	 * @param debitKey the debitKey to set
	 */
	public void setDebitKey(String debitKey) {
		this.debitKey = debitKey;
	}
	
}
