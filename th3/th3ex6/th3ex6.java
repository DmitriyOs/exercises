class Dog {
    String name;
    String say;
}

public class th3ex6 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.say = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.say = "Wurf!";
        System.out.println(spot.name + " said " + spot.say);
        System.out.println(scruffy.name + " said " + scruffy.say);
        Dog newdog = new Dog();
        newdog.name = "newdog";
        newdog.say = "newdogsay";
        System.out.println(spot == newdog);
        System.out.println(spot.equals(newdog));
        newdog = spot;
        System.out.println(spot == newdog);
        System.out.println(spot.equals(newdog));

    }
}