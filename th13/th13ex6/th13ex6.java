class MyClass {
    int i = 10;
    long l = 10L;
    float f = 10.f;
    double d = 10.0;

    public String toString() {
        return String.format("%d\n%d\n%f\n%e\n", i, l, f, d);
    }
}


public class th13ex6 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        System.out.println(m);
    }
}
