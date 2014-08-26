class Member {
    Member(String name) {
        System.out.println("Constructor of member named " + name);
    }
}

class Rodent {
    Member m1 = new Member("member1"), m2 = new Member("member2");

    Rodent() {
        System.out.println("Constructor of Rodent");
    }

    void DoSomething() {
        System.out.println("Rodent do something");
    }
}

class Mouse extends Rodent {
    Member m3 = new Member("member3"), m4 = new Member("member4");

    Mouse() {
        System.out.println("Constructor of Mouse");
    }

    void DoSomething() {
        System.out.println("Mouse do something");
    }
}

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Constructor of Gerbil");
    }

    void DoSomething() {
        System.out.println("Gerbil do something");
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("Constructor of Hamster");
    }

    void DoSomething() {
        System.out.println("Hamster do something");
    }
}


public class th8ex12 {
    public static void main(String[] args) {
        Rodent[] r = {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent t : r) {
            t.DoSomething();
        }
    }
}
