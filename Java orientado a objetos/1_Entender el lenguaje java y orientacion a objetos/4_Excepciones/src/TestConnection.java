public class TestConnection {
    public static void main(String[] args) throws Exception {

        try (Connection con = new Connection()) {
            con.readData();
        } catch (IllegalStateException ex) {
            System.out.println("Excecuting catch block");
            ex.printStackTrace();
        }

        /*
        Connection con = null;
        try {
            con = new Connection()

            con.readData();
        } catch (IllegalStateException ex) {
            System.out.println("Getting exception");
            ex.printStackTrace();
        } finally {
            System.out.println("Excecuting finally block");
            if(con != null) {
                con.closeConnection();
            }
        }
        */
    
    }
}
