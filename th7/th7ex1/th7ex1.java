class MyClass1 {
    private String s;

    MyClass1() {
        s = "first string";
    }

    public String toString() {
        return s;
    }
}

class MyClass2 {
    private MyClass1 my1;
    private String s;

    public String toString() {
        if (my1 == null) my1 = new MyClass1();
        if (s == null) s = "second string";

        return "text: " + my1 + " " + s;
    }

}


public class th7ex1 {
    public static void main(String[] args) {
        MyClass2 my = new MyClass2();
        System.out.println(my);
    }
}
