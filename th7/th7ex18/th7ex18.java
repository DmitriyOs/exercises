class MyClass {
    static int i = 0;
    final int x = i++;
    final static int z = i++;

    public String toString() {
        return "final: " + x + "  final static: " + z;
    }
}

public class th7ex18 {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        System.out.println(a);
        MyClass b = new MyClass();
        System.out.println(b);
    }
}
