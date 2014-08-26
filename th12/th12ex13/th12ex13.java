class MyException1 extends Exception {
}

class MyException2 extends Exception {
}

class MyException3 extends Exception {
}

class MyClass {
    void DoSomething(int x) throws MyException1, MyException2, MyException3 {
        if (x == 0) throw new MyException1();
        if (x == 1) throw new MyException2();
        if (x == 2) throw new MyException3();
    }
}


public class th12ex13 {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        try {
            MyClass f = null;
            f.DoSomething(0);
            my.DoSomething(0);
            my.DoSomething(1);
            my.DoSomething(2);
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        } finally {
            System.out.println("Finally worked");
        }
    }
}