public class th4ex10 {
    static int FirstNumber(int i) {
        return i / 1000;
    }

    static int SecondNumber(int i) {
        return (i % 1000) / 100;
    }

    static int ThirdNumber(int i) {
        return ((i % 1000) % 100) / 10;
    }

    static int FourthNumber(int i) {
        return ((i % 1000) % 100) % 10;
    }

    static int add(int i, int j) {
        return (i * 10) + j;
    }

    static void Compare(int i, int j, int k) {
        if (j * k == i) System.out.println(i + " = " + j + " * " + k);
    }

    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i++) {
            int a = FirstNumber(i);
            int b = SecondNumber(i);
            int c = ThirdNumber(i);
            int d = FourthNumber(i);
            Compare(i, add(a, b), add(c, d));
            Compare(i, add(a, b), add(d, c));
            Compare(i, add(a, c), add(b, d));
            Compare(i, add(a, c), add(d, b));
            Compare(i, add(a, d), add(b, c));
            Compare(i, add(a, d), add(c, b));
            Compare(i, add(b, a), add(c, d));
            Compare(i, add(b, a), add(d, c));
            Compare(i, add(b, c), add(d, a));
            Compare(i, add(b, d), add(c, a));
            Compare(i, add(c, a), add(d, b));
            Compare(i, add(c, b), add(d, a));
        }
    }
}
