public class th3ex14 {
    static void compare(String s1, String s2) {
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s1 != s2);
    }

    public static void main(String[] args) {
        String s1 = "first string";
        String s2 = "second string";
        compare(s1, s2);
    }
}
