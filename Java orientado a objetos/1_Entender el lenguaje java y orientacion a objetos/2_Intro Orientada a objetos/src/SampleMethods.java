public class SampleMethods {
    public static void main(String[] args) {

        Account myAccount = new Account(0);
        Account pedroAccount = new Account(0);
    
        myAccount.deposit(300);
        System.out.println("My account balance: " + myAccount.getBalance());

        myAccount.deposit(200);
        System.out.println("My account balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(100);
        System.out.println("My account balance after withdrawal: " + myAccount.getBalance());

        boolean transferToPedro = myAccount.transfer(200, pedroAccount);

        if (transferToPedro) {
            System.out.println("Transfer succesfull");
            System.out.println("My account balance after transfer to Pedro: " + myAccount.getBalance());
            System.out.println("Pedro account balance: " + pedroAccount.getBalance());
        }
        else {
            System.out.println("Operation couldn't be made");
        }

        if (pedroAccount.transfer(50, myAccount)) {
            System.out.println("Transfer succesfull");
            System.out.println("My account balance after transfer from Pedro: " + myAccount.getBalance());
            System.out.println("Pedro account balance: " + pedroAccount.getBalance());
        }
        else {
            System.out.println("Operation couldn't be made");
        }
    }
    
}
