import java.util.*;

public class th11ex14 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 1; i < 7; i++) {
            iterator.add(i);
            if (i % 2 == 0)
                iterator.previous();
            System.out.println(list);
        }
    }
}
