public class th10ex19_nested {
    static class InnerClass1 {
        static class InnerClass2 {
            void doSomething() {
                System.out.println("InnerClass 2 Do Something");
            }
        }

        void doSomething() {
            System.out.println("InnerClass 1 Do Something");
        }

        InnerClass2 createInnerClass2() {
            return new InnerClass2();
        }
    }

    InnerClass1 createInnerClass1() {
        return new InnerClass1();
    }

    public static void main(String[] args) {
        InnerClass1 in1 = new InnerClass1();
        in1.doSomething();
        new th10ex19_nested.InnerClass1().doSomething();
        new InnerClass1.InnerClass2().doSomething();
    }
}
