class Test {
    static int i = 0;
    private int x = i++;

    public String toString() {
        return "x == " + x;
    }
}

class MyClass {
    static final Test sf = new Test();
    final Test f = new Test();


    public String toString() {
        return "static final: " + sf + "  final: " + f;
    }
}


public class th7ex18 {
    public static void main(String[] args) {
        System.out.println(new MyClass());
        System.out.println(new MyClass());
    }
}
