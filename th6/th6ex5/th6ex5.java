class MyClass {
    private int priv;
    protected int prot;
    public int publ;
    int pack;

    private void setPriv() {
    }

    protected void setProt() {
    }

    public void setPubl() {
    }

    void setPack() {
    }

}

public class th6ex5 {
    public static void main(String[] args) {
        MyClass x = new MyClass();
        //x.priv
        x.setProt();
        x.publ = 1;
        x.setPack();
    }

}
