class MyClass {
    MyClass() {
        System.out.println("message!");
    }

    MyClass(String s) {
        System.out.println(s + " message!");
    }
}

public class th5ex4 {
    public static void main(String[] args) {
        MyClass test = new MyClass();
        MyClass test2 = new MyClass("my");
    }
}
