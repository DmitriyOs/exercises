abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape shape = new Rhomboid(); //if you want "No"
        //Shape shape = new Circle(); //if you want "Yes"
        Circle circle;
        if (shape instanceof Circle) {
            circle = (Circle) shape;
            System.out.println("Yes");
        } else System.out.println("No");

    }
}