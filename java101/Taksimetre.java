import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double tutar = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilometre bilgisini giriniz: ");
        km = input.nextInt();

        tutar += km * 2.20;
        tutar = tutar < 20 ? 20 : tutar;

        System.out.println("Taksimetre tutarı: " + tutar);
    }
}
