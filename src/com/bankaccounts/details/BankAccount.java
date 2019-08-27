package com.bankaccounts.details;
import static java.lang.System.*;
public class BankAccount {
	private int accountno;
	private String name,type;
	private double balance;
	private double totalwithdraw;
	private double totaldeposit;
	public BankAccount(int accountno, String name, String type, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	public void showAccountDetails() {
		out.println("Account number is"+accountno);
		out.println("Account name is"+name);
		out.println("Account type is"+type);
		out.println("Account balance is"+balance);
		
		
		
	}
	public void withDrawMoney(double amount) {
		balance=balance-amount;
        totalwithdraw=totalwithdraw+amount;
        out.println("Money withdrawn is"+balance);
        
       }
	public void depositMoney(double amount) {
		balance=balance+amount;
		totaldeposit=totaldeposit+amount;
		out.println("Money deposited is"+balance);
	}
	public void totalTransactions() {
		out.println("Amount withdrawn is"+totalwithdraw);
		out.println("Amount deposited is"+totaldeposit);
	}
    public static void main(String[]args) {
    	BankAccount b1=new BankAccount(1,"Akansha","Savings",18000);
    	b1.showAccountDetails();
    	b1.withDrawMoney(2000);
    	b1.depositMoney(100000);
    	b1.totalTransactions();
    	
    	
    	
    	
	
}
}
