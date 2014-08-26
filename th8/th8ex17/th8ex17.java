class Cycle {
    static void ride(Cycle tmp) {
    }
}

class Unicycle extends Cycle {
    void balance() {
        System.out.println("Unicycle balanced");
    }
}

class Bicycle extends Cycle {
    void balance() {
        System.out.println("Bicycle balanced");
    }
}

class Tricycle extends Cycle {

}

public class th8ex17 {
    public static void main(String[] args) {
        Cycle[] c = {new Unicycle(), new Bicycle(), new Tricycle()};
        //c[0].balance();
        //c[1].balance();
        //c[2].balance();
        ((Unicycle) c[0]).balance();
        ((Bicycle) c[1]).balance();
        //((Tricycle)c[2]).balance();
    }
}
