import java.util.Scanner;

public class DordunKatlariniToplama {
    public static void main(String[] args) {
        int n, toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        } while (n % 2 != 1);

        System.out.println("Girilen değerlerden 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
