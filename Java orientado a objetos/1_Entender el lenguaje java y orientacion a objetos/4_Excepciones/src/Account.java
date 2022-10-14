public abstract class Account {

	protected double balance;
	private int branch;
	private int number;

	private static int total = 0;

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


	public abstract void deposit(double value);

	public void withdraw(double value) throws InsufficientBalanceException{
		if (this.balance < value) {
			throw new InsufficientBalanceException("Insufficient balance");
		}
		this.balance -= value;
	}

	public boolean transfer(double value, Account acc) {
		if (this.balance >= value) {
			try {
				this.withdraw(value);
			} catch (InsufficientBalanceException e) {
				e.printStackTrace();
			}
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


	public static int getTotal() {	
		return Account.total;
	}

}