public class Main {
    public static void main(String[] args) {
        Dovuscu d1 = new Dovuscu("Rocky", 10, 100, 100, 0);
        Dovuscu d2 = new Dovuscu("Apollo", 8, 100, 105, 100);

        Mac mac = new Mac(d1, d2, 90, 110);
        mac.run();
    }
}