public class th3ex10 {
    public static void main(String[] args) {
        int i = 0xAAAA;
        int j = 0xD555;
        System.out.println("  i=" + Integer.toBinaryString(i));
        System.out.println("  j=" + Integer.toBinaryString(j));
        System.out.println("i&j=" + Integer.toBinaryString(i & j));
        System.out.println("i|j=" + Integer.toBinaryString(i | j));
        System.out.println("i^j=" + Integer.toBinaryString(i ^ j));
        System.out.println("~i=" + Integer.toBinaryString(~i));
        System.out.println("~j=" + Integer.toBinaryString(~j));
    }
}