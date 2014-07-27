class MyClass {
    MyClass(int i) {
        System.out.print(i);
    }

    MyClass(int i, String s) {
        this(i);
        System.out.print(" " + s);
    }
}

public class th5ex9 {
    public static void main(String[] args) {
        MyClass test = new MyClass(1, "amazing!");
    }
}