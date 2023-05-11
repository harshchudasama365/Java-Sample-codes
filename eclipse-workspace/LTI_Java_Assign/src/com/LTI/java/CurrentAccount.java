package com.LTI.java;

abstract class Account{
	private String accountNo;
	private double accountBalance;
	private String accountPassword;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	Account(){
		accountNo = "";
		accountBalance = 0.0;
		accountPassword = "";
	}
	public Account(String accountNo, double accountBalance, String accountPassword) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}
	void displayAccount() {
		System.out.println("Account No : "+accountNo);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account Password : "+accountPassword);
	}
	abstract void withdraw(int amount);
}

class SavingsAccount extends Account{
	double minimumBalance;
	SavingsAccount(String accountNo, double accountBalance, String accountPassword){
		super(accountNo, accountBalance, accountPassword);
		minimumBalance = 2000.0;
	}
	void displayAccount() {
		super.displayAccount();
		System.out.println("Minimum Balance : "+minimumBalance);
	}
	void withdraw(int amount) {
		setAccountBalance(getAccountBalance()-amount);
		System.out.println("Account Balance : "+(getAccountBalance()));
	}
}

class CurrentAccount extends Account{
double overdraftLimitAmount;
CurrentAccount(String accountNo, double accountBalance, String accountPassword){
	super(accountNo, accountBalance, accountPassword);
	overdraftLimitAmount = 5000.0;
}
void displayAccount() {
	super.displayAccount();
	System.out.println("Overdraft Limit : "+overdraftLimitAmount);
}
void withdraw(int amount) {
	setAccountBalance(getAccountBalance()-amount);
	System.out.println("Account Balance : "+(getAccountBalance()));
	overdraftLimitAmount -= amount;
	System.out.println("Overdraft Limit : "+(overdraftLimitAmount));
	}
}
