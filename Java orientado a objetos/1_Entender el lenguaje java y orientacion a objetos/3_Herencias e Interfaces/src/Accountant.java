public class Accountant extends Employee{
    
    @Override
    public double getBono() {
        System.out.println("Getting bono from Accountant");
        return 200;
    }
}
