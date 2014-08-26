abstract class MyFirstClass {
    abstract void doSomething();
}

class MySecondClass extends MyFirstClass {
    void doSomething() {
        System.out.println("Do Something");
    }

    static void Do(MyFirstClass c) {
        ((MySecondClass) c).doSomething();
    }
}


public class th9ex4 {
    public static void main(String[] args) {
        MyFirstClass firstClass = new MySecondClass();
        MySecondClass.Do(firstClass);
    }
}
