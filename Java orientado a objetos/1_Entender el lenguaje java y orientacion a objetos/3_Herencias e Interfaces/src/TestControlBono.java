public class TestControlBono {
    public static void main(String[] args) {
        
        Mannager jimena = new Mannager();
        jimena.setSalary(10000);

        Accountant alex = new Accountant();
        alex.setSalary(5000);

        Employee diego = new Accountant();
        diego.setSalary(2000);

        ControlBono controlBono = new ControlBono();

        controlBono.registerSalary(diego);
        controlBono.registerSalary(jimena);
        controlBono.registerSalary(alex);

    }
}
