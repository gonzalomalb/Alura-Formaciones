public class SampleReference2 {
    public static void main(String[] args) {
        
        Client client1 = new Client(); //instantiating new Client
        client1.setName("Pablo");
        Account account1 = new Account(0);
        account1.setHolder(client1); //overwriting Account holder by default
        System.out.println("Name of account1 holder: " + account1.getHolder().getName());

        Account account2 = new Account(0);
        account2.setHolder(new Client());
        account2.getHolder().setName("Diego");
        System.out.println("Name of account2 holder: " + account2.getHolder().getName());
    }
}
