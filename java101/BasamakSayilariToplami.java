import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int sayi, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz: ");
        sayi = input.nextInt();

        while (sayi != 0) {
            total += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + total);
    }
}
