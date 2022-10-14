public class TestExcecutionFlowExceptions {

    public static void main(String[] args) {
        System.out.println("Main Starts");
        method1();
        System.out.println("Main Ends");
    }

    private static void method1() {
        System.out.println("Method1 Starts");
        method2();
        System.out.println("Method1 Ends");
    }

    private static void method2() {
        System.out.println("Method2 Starts");

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            try {
                if (i == 3) {
                    int num = 0;
                    int result = i/num;
                    System.out.println(result);
                }
                String test = null;
                System.out.println(test.toString());
            }
            catch (Exception exception) { //(ArithmeticException | NullPointerException exception)
                System.out.println("Exception catch");
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }

        System.out.println("Method2 Ends");
        
        try {
            throw new MyException("My exception was thrown");
        } catch (MyException ex) {
            System.out.println(ex);
        }
    }

}