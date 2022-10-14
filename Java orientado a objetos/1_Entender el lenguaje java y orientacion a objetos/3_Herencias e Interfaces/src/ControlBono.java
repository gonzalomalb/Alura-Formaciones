public class ControlBono {
    
    private double sum;

    public double registerSalary(Employee functionary) {
        this.sum = functionary.getBono() + this.sum;
        System.out.println(this.sum);
        return this.sum;
    }
    
}
