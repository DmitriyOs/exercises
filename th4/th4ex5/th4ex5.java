public class th4ex5 {
    static void Print(Integer number) {
        if (number == 0) System.out.print(0);
        else {
            int numberOfZero = Integer.numberOfLeadingZeros(number);
            number <<= numberOfZero; //сдвиг нолей
            for (int i = 0; i < 32 - numberOfZero; i++) {
                int n = (Integer.numberOfLeadingZeros(number) == 0) ? 1 : 0;
                System.out.print(n);
                number <<= 1;
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int i = 0xAAAA;
        int j = 0xD555;
        System.out.println("  i=" + Integer.toBinaryString(i));
        System.out.print("  i=");
        Print(i);
        System.out.println("  j=" + Integer.toBinaryString(j));
        System.out.print("  j=");
        Print(j);
        System.out.println("i&j=" + Integer.toBinaryString(i & j));
        System.out.print("i&j=");
        Print(i & j);
        System.out.println("i|j=" + Integer.toBinaryString(i | j));
        System.out.print("i|j=");
        Print(i | j);
        System.out.println("i^j=" + Integer.toBinaryString(i ^ j));
        System.out.print("i^j=");
        Print(i ^ j);
        System.out.println("~i=" + Integer.toBinaryString(~i));
        System.out.print("~i=");
        Print(~i);
        System.out.println("~j=" + Integer.toBinaryString(~j));
        System.out.print("~j=");
        Print(~j);

    }
}