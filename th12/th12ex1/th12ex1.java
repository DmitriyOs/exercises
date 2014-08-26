public class th12ex1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Some string");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("RealLy Done");
        }
    }
}
