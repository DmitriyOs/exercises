public class Fibonacci {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int k1 = 0;
        int k2 = 1;
        int k3 = 0;
        System.out.print("1 ");
        for (int i = 1; i < k; i++) {
            k3 = k1 + k2;
            System.out.print(k3 + " ");
            k1 = k2;
            k2 = k3;

        }
    }
}
