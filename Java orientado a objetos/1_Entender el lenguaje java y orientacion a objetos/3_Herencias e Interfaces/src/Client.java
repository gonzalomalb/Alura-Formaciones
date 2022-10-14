public class Client implements Authenticator  {

    private String name;
    private String gender;
	private String id;
	private String phone;
    
    private AuthenticatorUtility util;

    public Client() {
        this.util = new AuthenticatorUtility();
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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
