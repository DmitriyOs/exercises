interface Cycle {
    int numberOfWheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public int numberOfWheels() {
        return 1;
    }
}

class UnicycleFactory implements CycleFactory {
    public Unicycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public int numberOfWheels() {
        return 2;
    }
}

class BicycleFactory implements CycleFactory {
    public Bicycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public int numberOfWheels() {
        return 3;
    }
}

class TricycleFactory implements CycleFactory {
    public Tricycle getCycle() {
        return new Tricycle();
    }
}


public class th9ex18 {
    static void ride(CycleFactory f) {
        Cycle cycle = f.getCycle();
        System.out.println("Ride on " + cycle.numberOfWheels() + "-cycle");
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
        ride(new TricycleFactory());
    }
}
