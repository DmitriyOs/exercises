import java.util.*;

import net.mindview.util.*;

public class th11ex21 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(
                new TextFile("th11/th11ex21/th11ex21.java", "\\W+"));
        System.out.println(words);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            Integer i = map.get(word);
            map.put(word, i == null ? 1 : i + 1);
        }
        System.out.println(map);
        List<String> keys = new ArrayList<String>(map.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for (String s : keys) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
