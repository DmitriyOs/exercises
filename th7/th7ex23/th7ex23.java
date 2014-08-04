class Test {
    static {
        System.out.println("class loaded");

    }

    static void staticTest() {
        System.out.println("staticTest()");
    }
}

public class th7ex23 {
    public static void main(String[] args) {
        System.out.println("Run staticTest()");
        Test.staticTest();
        System.out.println("Creating an object Test");
        new Test();
    }
}
