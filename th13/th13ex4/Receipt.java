import java.util.*;

public class Receipt {
    public static final int ITEM_FORMAT = 15;
    public static final int QTY_FORMAT = 5;
    public static final int PRICE_FORMAT = 10;
    private static String TITLE_FORMAT = "%-" + ITEM_FORMAT + "s %" + QTY_FORMAT + "s %" + PRICE_FORMAT + "s\n";
    private static final String ITEM_STRING = "%-" + ITEM_FORMAT + ".15s %" + QTY_FORMAT + "d %" + PRICE_FORMAT + ".2f\n";
    private static final String TOTAL_FORMAT = "%-" + ITEM_FORMAT + "s %" + QTY_FORMAT + "s %" + PRICE_FORMAT + ".2f\n";

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format(TITLE_FORMAT, "Item", "Qty", "Price");
        f.format(TITLE_FORMAT, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(ITEM_STRING, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(TOTAL_FORMAT, "Tax", "", total * 0.06);
        f.format(TITLE_FORMAT, "", "", "-----");
        f.format(TOTAL_FORMAT, "Total", "",
                total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
