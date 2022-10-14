public class TestInternalSystem {
    
    public static void main(String[] args) {

        InternalSystem sys = new InternalSystem();

        Mannager mannager = new Mannager();
        mannager.setKey(12345);

        Administrator admin = new Administrator();
        admin.setKey(44444);

        Client juan = new Client();
        juan.setKey(12345);

        sys.authenticate(mannager);
        sys.authenticate(admin);
        sys.authenticate(juan);
    }
}
