class Outer {
    class Inner {

    }

    Inner getInner() {
        return new Inner();
    }
}


public class th10ex1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.getInner();
    }
}
