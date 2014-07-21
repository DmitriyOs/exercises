public class th4ex4 {
    public static void main(String[] args) {
        for (int k = 2; k < 100; k++) {
            int i = 2;
            for (; i < k; i++) {
                if (k % i == 0) break;
            }
            if (k == i) System.out.print(k + " ");
        }
    }
}
