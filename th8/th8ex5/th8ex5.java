class Cycle {
    int wheels() {
        return 0;
    }

    static void ride(Cycle tmp) {
        System.out.println(tmp.wheels() + "-cycle");
    }
}

class Unicycle extends Cycle {
    int wheels() {
        return 1;
    }

}

class Bicycle extends Cycle {
    int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    int wheels() {
        return 3;
    }
}

public class th8ex5 {
    public static void main(String[] args) {
        Cycle.ride(new Unicycle());
        Cycle.ride(new Bicycle());
        Cycle.ride(new Tricycle());
    }
}