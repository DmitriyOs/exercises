interface MyInterfaceA {
    void DoSomethingA1();

    void DoSomethingA2();
}

interface MyInterfaceB {
    void DoSomethingB1();

    void DoSomethingB2();
}

interface MyInterfaceC {
    void DoSomethingC1();

    void DoSomethingC2();
}

interface MyInterfaceD extends MyInterfaceA, MyInterfaceB, MyInterfaceC {
    void DoSomethingD();
}

abstract class Concrete {
    abstract void DoSomethingConcrete();
}

class MyClass extends Concrete implements MyInterfaceD {
    public void DoSomethingA1() {
    }

    public void DoSomethingA2() {
    }

    public void DoSomethingB1() {
    }

    public void DoSomethingB2() {
    }

    public void DoSomethingC1() {
    }

    public void DoSomethingC2() {
    }

    public void DoSomethingD() {
    }

    void DoSomethingConcrete() {

    }

    public static void DoWithArgument1(MyInterfaceA i) {

    }

    public static void DoWithArgument2(MyInterfaceB i) {

    }

    public static void DoWithArgument3(MyInterfaceC i) {

    }

    public static void DoWithArgument4(MyInterfaceD i) {

    }
}

public class th9ex15 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        MyClass.DoWithArgument1(m);
        MyClass.DoWithArgument2(m);
        MyClass.DoWithArgument3(m);
        MyClass.DoWithArgument4(m);
    }
}
