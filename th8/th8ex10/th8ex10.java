class Base {
    void first() {
        second();
    }

    void second() {
        System.out.println("Second method in Base class");
    }
}

class Inherited extends Base {
    void second() {
        System.out.println("Second method in Inherited class");
    }
}

public class th8ex10 {
    public static void main(String[] args) {
        Base tmp = new Inherited();
        tmp.first();
    }
}
/*
method first() in Inherited (extends Base) called second() in Inherited class
*/