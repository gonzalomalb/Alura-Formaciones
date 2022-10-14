public class TestExceptionAccountBalance {
    public static void main(String[] args) {
        Account acc = new SavingsAccount(123, 456);
        acc.deposit(200);
        try {
            acc.withdraw(200);
            acc.withdraw(10);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
