class Amphibian {
    void doIt() {
        System.out.println("Do something with Amphibian");
    }

    static void doSomething(Amphibian a) {
        System.out.println("Do with Amphibian");
        a.doIt();
    }
}

class Frog extends Amphibian {
    @Override
    void doIt() {
        System.out.println("Do something with Frog");
    }

    static void doSomething(Amphibian a) {
        System.out.println("Do with Frog");
        a.doIt();
    }
}

public class th7ex17 {
    public static void main(String[] args) {
        Amphibian f = new Frog();
        f.doIt();
        Amphibian.doSomething(f);
        ((Amphibian) f).doIt();

    }
}
