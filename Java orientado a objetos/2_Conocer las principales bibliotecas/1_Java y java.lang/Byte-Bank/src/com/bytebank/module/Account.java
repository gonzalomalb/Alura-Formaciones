package com.bytebank.module;

/*Accessibility:
		--public: access from anywhere.
		--default: access only inside package.		
		--protected: default + children class.
		--private: access only from class.
	*/

public abstract class Account {

	protected double balance;
	private int branch;
	private int number;
	private Client holder = new Client();
	private static int total = 0;

	/**
	 * @Instance of new Account without parameters
	 */
	public Account(){

	}

	/**
	 * Instance of new Account with parameters
	 * @param branch number of bank branch
	 * @param number number of account
	 */
	public Account(int branch, int number) {
		if (branch <= 0) {
			System.out.println("Values higher than 0");
			this.branch = 1;
		}
		else {
			this.branch = branch;
		}
		this.number = number;
		total ++;
	}

	/**
	 * Method to deposit money 
	 * @param value 
	 */
	public abstract void deposit(double value);

	/**
	 * Method to withraw money, returns a boolean to check if opeartion can be made or not.
	 * @param value
	 * @return
	 */
	public boolean withdraw(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}

	/**
	 * Method to transfer money between accounts, returns a boolean to check if operation can or can't be made.
	 * @param value
	 * @param acc
	 * @return
	 */
	public boolean transfer(double value, Account acc){
		if (this.balance >= value) {
			this.withdraw(value);
			acc.deposit(value);
			return true;
		}
		return false;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getBranch(){
		return this.branch;
	}

	public void setNumber(int number) {
		if(number > 0) {
			this.number = number;
		}
		else {
			System.out.println("Account number must be higher than 0");
		}
	}

	public int getNumber() {
		return this.number;
	}

	public void setHolder(Client holder) {
		this.holder = holder;
	}

	public Client getHolder() {
		return this.holder;
	}

	public static int getTotal() {	
		return Account.total;
	}

}