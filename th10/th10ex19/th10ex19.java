public class th10ex19 {
    class InnerClass1 {
        class InnerClass2 {
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
        th10ex19 t = new th10ex19();
        InnerClass1 in1 = t.createInnerClass1();
        in1.doSomething();
        InnerClass1.InnerClass2 in2 = in1.createInnerClass2();
        in2.doSomething();
    }
}
