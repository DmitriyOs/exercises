class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}

public class MyStaticTest {
    public static void main(String[] args) {
        System.out.println("i = " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("incremented: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 1;
        System.out.println("st1.i = 1");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        StaticTest.i = 2;
        System.out.println("StaticTest.i = 2");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}