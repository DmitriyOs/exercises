public interface th10ex21 {
    void doSomething();

    public static class Nested implements th10ex21 {
        public void doSomething() {
            System.out.println("Do Something");
        }

        public static void main(String[] args) {
            Nested nested = new Nested();
            nested.doSomething();
        }
    }
}
