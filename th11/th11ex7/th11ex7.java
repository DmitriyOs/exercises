import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyClass {
    private static int counter;
    private int count = counter++;

    public String toString() {
        return Integer.toString(count);
    }
}


public class th11ex7 {
    public static void main(String[] args) {
        MyClass[] array = new MyClass[5];
        for (int i = 0; i < 5; i++) {
            array[i] = new MyClass();
        }
        List<MyClass> list = new ArrayList<MyClass>(Arrays.asList(array));
        System.out.println("list = " + list);
        List<MyClass> sublist = list.subList(1, 3);
        System.out.println("sublist = " + sublist);
        list.removeAll(sublist);
        System.out.println("list = " + list);

    }
}
