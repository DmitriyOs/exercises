class MyException1 extends Exception {
}

class MyException2 extends Exception {
}

class MyClass {
    void f() throws MyException2 {
        try {
            g();
        } catch (Exception e) {
            throw new MyException2();
        }
    }

    void g() throws MyException1 {
        throw new MyException1();
    }
}

public class th12ex10 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        try {
            m.f();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
