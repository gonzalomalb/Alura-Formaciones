public class TestExceptionChecked {
    public static void main(String[] args) {
        
        RanomMethod et = new RanomMethod();
        try {
            et.method();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
