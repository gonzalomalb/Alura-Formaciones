public class TestMannager {
    public static void main(String[] args) {
        
        Mannager mannager = new Mannager();
        mannager.setType(1);
        mannager.setSalary(5000);
        mannager.setKey(12345);

        System.out.println(mannager.getSalary());
        System.out.println(mannager.getBono());
        System.out.println(mannager.login(mannager.getKey()));
    }

}
