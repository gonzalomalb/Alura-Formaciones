public class SampleConstructor {
    public static void main(String[] args) {
        Account account1 = new Account(553);
        Account account2 = new Account(554);
        Account account3 = new Account(555);


        System.out.println(account1.getBranch());
        System.out.println(account2.getBranch());
        System.out.println(account3.getBranch());

        System.out.println("Number of accounts created: " + Account.getTotal());
    }
}
