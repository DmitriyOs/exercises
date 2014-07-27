enum Banknotes {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

public class th5ex22 {
    public static void main(String[] args) {
        for (Banknotes x : Banknotes.values()) {
            //System.out.println(x.ordinal()+" "+x);
            switch (x) {
                case ONE:
                    System.out.println("1$");
                    break;
                case FIVE:
                    System.out.println("5$");
                    break;
                case TEN:
                    System.out.println("10$");
                    break;
                case TWENTY:
                    System.out.println("20$");
                    break;
                case FIFTY:
                    System.out.println("50$");
                    break;
                case HUNDRED:
                    System.out.println("100$");
                    break;
            }

        }

    }
}
