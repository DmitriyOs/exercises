class Tank {
    boolean isFilled = false;

    Tank(boolean isFilled) {
        this.isFilled = isFilled;
    }

    void SetFilled() {
        isFilled = true;
    }

    void SetEmpty() {
        isFilled = false;
    }

    protected void finalize() {
        if (isFilled)
            System.out.println("Error! Tank is not empty");
    }
}

public class th5ex12 {
    public static void main(String[] args) {
        Tank t = new Tank(true);
        t.SetEmpty();
        new Tank(true);
        System.gc();
    }
}
