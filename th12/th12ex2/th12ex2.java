public class th12ex2 {
    public static void main(String[] args) {
        Integer i = null;
        try {
            i.floatValue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
