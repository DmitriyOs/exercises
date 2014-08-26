import java.util.ArrayList;
import java.util.Iterator;

public class Sequence {
    private ArrayList<Object> array = new ArrayList<Object>();

    public void add(Object x) {
        array.add(x);
    }

    public Iterator<Object> iterator() {
        return array.iterator();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator<Object> iterator = sequence.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() + " ");
    }
}
