public class Connection implements AutoCloseable{

    public Connection() {
        System.out.println("Establishing connection");    
    }

    public void readData() {
        System.out.println("Reading data");
        throw new IllegalStateException();
    }

    public void closeConnection() {
        System.out.println("Closing connection");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Throwing exception with close()");
        closeConnection();  
    }

}
