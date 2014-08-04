//based on ex10, not ex9

class Component1 {
    Component1(String s) {
        System.out.println("Constructor Component1 " + s);
    }

    void dispose() {
        System.out.println("Erasing Component1");
    }
}

class Component2 {
    Component2(String s) {
        System.out.println("Constructor Component2 " + s);
    }

    void dispose() {
        System.out.println("Erasing Component2");
    }
}

class Component3 {
    Component3(String s) {
        System.out.println("Constructor Component3 " + s);
    }

    void dispose() {
        System.out.println("Erasing Component3");
    }
}

class Root {
    Component1 c1 = new Component1("mytext");
    Component2 c2 = new Component2("mytext");
    Component3 c3 = new Component3("mytext");

    Root(String s) {
        System.out.println("Constructor Root " + s);
    }

    void dispose() {
        System.out.println("Erasing Root");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
}

class Stem extends Root {
    Component1 c1 = new Component1("mytext");
    Component2 c2 = new Component2("mytext");
    Component3 c3 = new Component3("mytext");

    Stem(String s) {
        super(s);
        System.out.println("Constructor Stem " + s);
    }

    void dispose() {
        System.out.println("Erasing Stem");
        c1.dispose();
        c2.dispose();
        c3.dispose();
        super.dispose();
    }
}

public class th7ex12 {
    public static void main(String[] args) {
        Stem s = new Stem("mytext");
        s.dispose();
    }
}
