class Test {

}

class MyClass {
    private final Test t;

    MyClass() {
        t = new Test();
        //t=new Test(); //"variable might already have been assigned to"
    }
}

public class th7ex19 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
    }
}
