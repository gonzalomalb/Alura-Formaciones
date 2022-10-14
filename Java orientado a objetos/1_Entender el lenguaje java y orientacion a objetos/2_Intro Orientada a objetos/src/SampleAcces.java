public class SampleAcces {
    public static void main(String[] args) {

        Account account = new Account(22);
        account.deposit(400);
        account.withdraw(300);
        System.out.println(account.getBalance());

        System.out.println("Branch number: " + account.getBranch());

        account.setNumber(-122222);
        account.setNumber(122222);
        System.out.println("Account number: " + account.getNumber());
    }
}
