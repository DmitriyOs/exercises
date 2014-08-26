interface U {
    void A();

    void B();

    void C();
}

class A {
    U getU() {
        return new U() {
            public void A() {
                System.out.println("A");
            }

            public void B() {
            }

            public void C() {
            }
        };
    }
}

class B {
    private U[] array;
    private int size;

    B(int size) {
        this.size = size;
        array = new U[size];
    }

    void add(U x) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                array[i] = x;
            }
        }
    }

    void setNull(int position) {
        if (position >= size) {
            System.out.println("Out of array!");
            return;
        }
        array[position] = null;
    }

    void move() {
        for (int i = 0; i < size; i++) {
            if (array[i] != null) {
                array[i].A();
                array[i].B();
                array[i].C();
            }
        }
    }

}

public class th10ex23 {
    public static void main(String[] args) {
        int size = 5;
        A[] array = new A[size];
        for (int i = 0; i < size; i++) {
            array[i] = new A();
        }
        B b = new B(size);
        for (int i = 0; i < size; i++) {
            b.add(array[i].getU());
        }
        b.setNull(7);
        b.setNull(2);
        b.move();
    }
}
