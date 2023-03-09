import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen n sayısını giriniz: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            total += 1 / i;
        }

        System.out.println("Sonuç: " + total);
    }
}
