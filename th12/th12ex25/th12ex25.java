class MyException1 extends Exception {
}

class MyException2 extends MyException1 {
}

class MyException3 extends MyException2 {
}

class A {
    void DoSomething() throws MyException1 {
        throw new MyException1();
    }
}

class B extends A {
    void DoSomething() throws MyException2 {
        throw new MyException2();
    }
}

class C extends B {
    void DoSomething() throws MyException3 {
        throw new MyException3();
    }
}

public class th12ex25 {
    public static void main(String[] args) {
        A test = new C();
        try {
            test.DoSomething();
        } catch (MyException1 e) {
            System.out.println(e);
        }
    }
}
