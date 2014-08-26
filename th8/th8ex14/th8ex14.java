class Member {
    private static int counter = 0;

    void addRef() {
        System.out.println("Add. Number of reference " + ++counter);
    }

    void dispose() {
        if (--counter == 0)
            System.out.println("Disposing Member");
    }

}

class Rodent {
    //Member m1 = new Member("member1"), m2 = new Member("member2");
    Member m;

    Rodent(Member m) {
        this.m = m;
        this.m.addRef();

        System.out.println("Constructor of Rodent");
    }

    void DoSomething() {
        System.out.println("Rodent do something");
    }

    void dispose() {
        System.out.println("Disposing " + this);
        m.dispose();
    }

    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    //Member m3 = new Member("member3"), m4 = new Member("member4");

    Mouse(Member m) {
        super(m);
        System.out.println("Constructor of Mouse");
    }

    void DoSomething() {
        System.out.println("Mouse do something");
    }

    public String toString() {
        return "Mouse";
    }
}

class Hamster extends Rodent {
    Hamster(Member m) {
        super(m);
        System.out.println("Constructor of Hamster");
    }

    void DoSomething() {
        System.out.println("Hamster do something");
    }

    public String toString() {
        return "Hamster";
    }
}


public class th8ex14 {
    public static void main(String[] args) {
        Member m = new Member();
        Rodent[] r = {new Mouse(m), new Hamster(m), new Rodent(m), new Mouse(m), new Hamster(m)};
        for (Rodent t : r) {
            t.dispose();
        }


    }
}
