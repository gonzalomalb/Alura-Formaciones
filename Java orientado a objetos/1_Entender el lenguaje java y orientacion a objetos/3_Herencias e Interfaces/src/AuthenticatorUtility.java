public class AuthenticatorUtility {
    
    private int key;

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public boolean login(int key) {
        return getKey() == key;
    }

}
