interface MyInterfaceA {
    void DoSomething();
}

interface MyInterfaceB extends MyInterfaceA {
    void DoSomething();
}

interface MyInterfaceC extends MyInterfaceA {
    void DoSomething();
}

interface MyInterfaceD extends MyInterfaceB, MyInterfaceC {
    void DoSomething();
}

class MyClass implements MyInterfaceD {
    public void DoSomething() {
        System.out.println("Something done!");
    }
}

public class th9ex13 {
    static MyClass m = new MyClass();

    public static void main(String[] args) {
        m.DoSomething();
    }
}
