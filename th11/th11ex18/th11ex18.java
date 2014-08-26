import java.util.*;

public class th11ex18 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('D', 2);
        map.put('A', 1);
        map.put('C', 3);
        map.put('X', 5);
        map.put('F', 4);
        map.put('O', 7);
        System.out.println(map);
        Set<Character> sortedKeys = new TreeSet<Character>(map.keySet());
        System.out.println(sortedKeys);
        Map<Character, Integer> mapSorted = new LinkedHashMap<Character, Integer>();
        for (Character c : sortedKeys) {
            System.out.println(c);
            mapSorted.put(c, map.get(c));
        }
        System.out.println(mapSorted);


    }
}
