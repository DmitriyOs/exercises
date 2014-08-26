interface Rodent {
    void DoSomething();
}

class Mouse implements Rodent {
    public void DoSomething() {
        System.out.println("Mouse do something");
    }
}

class Gerbil implements Rodent {
    public void DoSomething() {
        System.out.println("Gerbil do something");
    }
}

class Hamster implements Rodent {
    public void DoSomething() {
        System.out.println("Hamster do something");
    }
}


public class th9ex7 {
    public static void main(String[] args) {
        Rodent[] r = {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent t : r) {
            t.DoSomething();
        }
    }
}
