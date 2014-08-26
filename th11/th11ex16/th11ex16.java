import java.util.*;

import net.mindview.util.*;

public class th11ex16 {
    final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'u', 'o', 'i', 'A', 'E', 'U', 'O', 'I'));

    public static void main(String[] args) {
        Set<String> words = new HashSet<String>(
                new TextFile("th11/th11ex16/UniqueWords.java", "\\W+"));
        System.out.println(words);
        int countInFile = 0;
        for (String s : words) {
            int countInWord = 0;
            for (Character c : s.toCharArray()) {
                if (vowels.contains(c)) {
                    countInFile++;
                    countInWord++;
                }
            }
            System.out.println("In word " + s + " " + countInWord + " wovels");


        }
        System.out.println("In file " + countInFile + " wovels");
    }
}
