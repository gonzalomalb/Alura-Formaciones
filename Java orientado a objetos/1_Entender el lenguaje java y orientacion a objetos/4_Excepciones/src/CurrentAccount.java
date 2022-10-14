public class CurrentAccount extends Account {
    
    public CurrentAccount(int branch, int number) {
        super(branch, number);
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void withdraw(double value) throws InsufficientBalanceException {
        double commission = 0.2;
        super.withdraw(value + commission);
    }
 
}
