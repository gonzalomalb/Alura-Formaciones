public class SampleReference {
    public static void main(String[] args) {

        Account firstAccount = new Account(0);
		firstAccount.deposit(500);
		System.out.println("Balance of first account: " + firstAccount.getBalance());

		Account secondAccount = firstAccount;
		secondAccount.deposit(500);
		System.out.println("Balance of first account after being declared on secondAccount: " + firstAccount.getBalance());
	
		System.out.println("Memory allocated id for firstAccount variable: " + firstAccount);		

		if (firstAccount == secondAccount){
			System.out.println("The variables are the same object: " + secondAccount);
		}
		else {
			System.out.println("Memory allocated id for secondAccount variable: " + secondAccount);
		}
    }
}
