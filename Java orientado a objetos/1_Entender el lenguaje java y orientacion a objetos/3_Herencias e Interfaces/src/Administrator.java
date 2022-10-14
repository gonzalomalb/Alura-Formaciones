public class Administrator extends Employee implements Authenticator{

    private AuthenticatorUtility util; 

    public Administrator() {
        this.util = new AuthenticatorUtility();
    }

    @Override
    public double getBono() {
        return 0;
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
