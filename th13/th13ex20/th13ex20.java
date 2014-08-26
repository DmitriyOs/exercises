import java.util.*;

class MyClass {
    int i;
    long l;
    float f;
    double d;
    String s;

    MyClass(String input) {
        Scanner scanner = new Scanner(input);
        i = scanner.nextInt();
        l = scanner.nextLong();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
        s = scanner.next();
    }

    public String toString() {
        return i + " " + l + " " + f + " " + d + " " + s;
    }
}

public class th13ex20 {
    public static void main(String[] args) {
        MyClass m = new MyClass("10 9223372036854775807 10,0 10,567 Text");
        System.out.println(m);
    }
}