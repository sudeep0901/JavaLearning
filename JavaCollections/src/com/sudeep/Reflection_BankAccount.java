package com.sudeep;

public class Reflection_BankAccount {
	private String id = "";

	public Reflection_BankAccount(String id) {
		super();
		this.id = id;
	}

	private int balance = 0;

	public synchronized int getBalance() {
		return balance;
	}

	public synchronized void setBalance(int balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public Reflection_BankAccount(String id, int balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public synchronized void deposit(int amount) {
		this.balance += amount;
	}

	public synchronized void withdrawl(int amount) {
		this.balance -= amount;
	}

}
