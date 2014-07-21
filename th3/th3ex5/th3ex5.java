
class Dog {
    String name;
    String say;
}

public class th3ex5 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.say = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.say = "Wurf!";
        System.out.println(spot.name + " said " + spot.say);
        System.out.println(scruffy.name + " said " + scruffy.say);
    }
}
