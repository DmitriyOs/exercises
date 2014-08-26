import java.lang.reflect.Field;

public class th14ex9 {
    public static void f(Object o) {
        f2(o.getClass());
    }

    public static void f2(Class c) {
        if (c == null) return;
        System.out.println("Class name: " + c.getName());
        Field[] fields = c.getFields();
        if (fields.length != 0) {
            System.out.println("Fields:");
        }
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println();
        f2(c.getSuperclass());
    }

    public static void main(String[] args) {
        String s = "";
        Integer i = 0;
        f(s);
        System.out.println("--------------------");
        f(i);
        int i2 = 0;
    }
}
