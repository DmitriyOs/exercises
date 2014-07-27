public class th5ex19 {
    static void f(String... args) {
        System.out.print(args.length + " ");
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f();
        f("string1", "string2");
        f(new String[]{"string1", "string2", "string3",});
    }
}
