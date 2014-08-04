class A {
    A() {
        System.out.println("Constructor A");
    }

}

class B {
    B() {
        System.out.println("Constructor B");
    }


}

class C extends A {
    B b = new B();

}

public class th7ex5 {
    public static void main(String[] args) {
        C c = new C();
    }

}
