import mypackage.*;

public class th6ex8 {
    public static void main(String[] args) {
        //Connection c1 = new Connection(); //because constructor not public
        Connection c = new ConnectionManager().getConnection();
        while (c != null) {
            System.out.println("Connection!");
            c = ConnectionManager.getConnection();
        }
    }
}