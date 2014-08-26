class WithInner {
    class Inner {
        Inner(String s) {
            System.out.println(s);
        }
    }
}

class SecondClass {
    class SecondInner extends WithInner.Inner {
        SecondInner(WithInner wi, String s) {
            wi.super(s);
        }
    }
}


public class th10ex26 {
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        SecondClass second = new SecondClass();
        SecondClass.SecondInner si = second.new SecondInner(wi, "Something");
    }
}
