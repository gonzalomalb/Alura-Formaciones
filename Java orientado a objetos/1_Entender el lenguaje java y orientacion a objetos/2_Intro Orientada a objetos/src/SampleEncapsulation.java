public class SampleEncapsulation {
    public static void main(String[] args) {

        Account account = new Account(0);
        Client client = new Client();
        account.setHolder(client);
        client.setName("Pablo");
        client.setId("25252525");

        Client pablo = account.getHolder();

        

        System.out.println("Name of the client: " + client.getName() + " ,Id of the client: " + client.getId());
        System.out.println("Name of the account holder: " + account.getHolder().getName() + " ,Id of the account holder: " + account.getHolder().getId());
        System.out.println(account.getHolder());
        System.out.println(client);
        System.out.println(pablo);
    }
}
