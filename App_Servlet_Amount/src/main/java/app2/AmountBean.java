package app2;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AmountBean implements Serializable 
{
	private int amount,balance;
	private String name;
	public AmountBean() {}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
