class Dog {
    void bark() {
        System.out.println("no bark :)");
    }

    void bark(int i) {
        System.out.println("int bark " + i);
    }

    void bark(long i) {
        System.out.println("long bark " + i);
    }

    void bark(float i) {
        System.out.println("float bark " + i);
    }

    void bark(double i) {
        System.out.println("double bark " + i);
    }

    void bark(short i) {
        System.out.println("short bark " + i);
    }

    void bark(byte i) {
        System.out.println("byte bark " + i);
    }

    void bark(char i) {
        System.out.println("char bark " + i);
    }

    void bark(int i, char j) {
        System.out.println("int-char bark " + i + "-" + j);
    }

    void bark(char i, int j) {
        System.out.println("char-int bark " + i + "-" + j);
    }
}

public class th5ex6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1);
        dog.bark(1L);
        dog.bark(1f);
        dog.bark(1.0);
        dog.bark((short) 1);
        dog.bark((byte) 1);
        dog.bark('c');
        dog.bark(1, 'c');
        dog.bark('c', 1);

    }
}
