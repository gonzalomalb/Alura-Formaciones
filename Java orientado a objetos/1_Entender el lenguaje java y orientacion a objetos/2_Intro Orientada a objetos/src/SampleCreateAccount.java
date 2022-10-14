
public class SampleCreateAccount {
	
	public static void main(String[] args) {
		
		Account firstAccount = new Account(0);
		firstAccount.deposit(500);
		System.out.println("Balance of first account: " + firstAccount.getBalance());

		Account secondAccount = new Account(0);
		secondAccount.deposit(500);
		System.out.println("Balance of second account: " + secondAccount.getBalance());

	}
}
