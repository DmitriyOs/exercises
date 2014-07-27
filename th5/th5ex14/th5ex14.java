class MyClass {
    static String s1 = new String("first");
    static String s2;

    static {
        s2 = new String("second");
    }

    static void Start() {
        System.out.println(s1 + " " + s2);
    }
}

public class th5ex14 {
    public static void main(String[] args) {
        MyClass.Start();

    }
}
