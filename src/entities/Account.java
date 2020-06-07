package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;		
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double value) {
		this.balance += value;
		System.out.println("Uppate accounte data:");
		System.out.println(toString());
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.00;
		System.out.println("Uppate accounte data:");
		System.out.println(toString());
	}
	
	public String toString() {
		return "Account: "
				+ this.number
				+", Holder: "
				+ this.holder
				+", Balance: $ "
				+ String.format("%.2f", this.balance);
				
	}

}
