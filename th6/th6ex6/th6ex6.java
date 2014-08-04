class MyClass {
    protected static String s = "original text";
}


public class th6ex6 {
    static void Manipulate() {
        MyClass.s = "changed string";
    }

    public static void main(String[] args) {
        System.out.println(MyClass.s);
        Manipulate();
        System.out.println(MyClass.s);

    }
}
