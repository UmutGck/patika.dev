import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int n, min_ = Integer.MAX_VALUE, max_ = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = input.nextInt();
            if (sayi > max_) {
                max_ = sayi;
            }
            if (sayi < min_) {
                min_ = sayi;
            }
        }

        System.out.println("En küçük sayı: " + min_ + "\nEn büyük sayı: " + max_);
    }
}
