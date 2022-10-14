public  class Mannager extends Employee implements Authenticator{

    private AuthenticatorUtility util; 

    public Mannager() {
        this.util = new AuthenticatorUtility();
    }
    
    public double getBono() {
        System.out.println("Getting bono from Mannager");
        return super.getSalary() + this.getSalary() * 0.05;
    }

    @Override
    public void setKey(int key) {
        this.util.setKey(key);
    }

    @Override
    public int getKey() {
        return this.util.getKey();
    }

    @Override
    public boolean login(int key) {
        return this.util.login(key);  
    }
}
