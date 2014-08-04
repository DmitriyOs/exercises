class Component1 {
    Component1(String s) {
        System.out.println("Constructor Component1 " + s);
    }
}

class Component2 {
    Component2(String s) {
        System.out.println("Constructor Component2 " + s);
    }
}

class Component3 {
    Component3(String s) {
        System.out.println("Constructor Component3 " + s);
    }
}

class Root {
    Component1 c1 = new Component1("mytext");
    Component2 c2 = new Component2("mytext");
    Component3 c3 = new Component3("mytext");

    Root(String s) {
        System.out.println("Constructor Root " + s);
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
}

public class th7ex10 {
    public static void main(String[] args) {
        Stem s = new Stem("mytext");
    }
}
