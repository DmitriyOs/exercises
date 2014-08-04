package mypackage;

public class ConnectionManager {
    private static int i;
    private static Connection[] c = new Connection[5];

    static {
        for (int i = 0; i < 5; i++) {
            c[i] = new Connection();
        }
    }

    public static Connection getConnection() {
        while (i < c.length)
            return c[i++];
        return null;
    }


}
