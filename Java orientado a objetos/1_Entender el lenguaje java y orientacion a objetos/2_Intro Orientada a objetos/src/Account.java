public class Account {

	private double balance;
	private int branch;
	private int number;
	private Client holder = new Client();

	private static int total = 0;

	public Account(int branch) {
		if (branch <= 0) {
			System.out.println("Values higher than 0");
			this.branch = 1;
		}
		else {
			this.branch = branch;
		}
		total ++;
	}


	public void deposit(double value) {
		this.balance += value;
	}

	public boolean withdraw(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}

	public boolean transfer(double value, Account acc) {
		if (this.balance >= value) {
			this.balance -= value;
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