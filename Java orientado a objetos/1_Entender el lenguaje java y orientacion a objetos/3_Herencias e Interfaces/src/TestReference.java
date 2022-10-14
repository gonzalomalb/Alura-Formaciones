public class TestReference {
    public static void main(String[] args) {
        
        Employee functionary = new Accountant();
        functionary.setName("Diego");

        Mannager mannager = new Mannager();
        mannager.setName("Pablo");

        functionary.setSalary(2000);
        mannager.setSalary(10000);

    }
}
