class Cycle {
    static void ride(Cycle tmp) {
    }
}

class Unicycle extends Cycle {

}

class Bicycle extends Cycle {

}

class Tricycle extends Cycle {

}

public class th8ex1 {
    public static void main(String[] args) {
        Cycle.ride(new Unicycle());
        Cycle.ride(new Bicycle());
        Cycle.ride(new Tricycle());
    }
}
