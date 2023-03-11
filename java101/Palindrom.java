import java.util.Scanner;

public class Palindrom {
    static boolean palindrom(int sayi) {
        int geciciSayi = sayi, tersSayi = 0, sonBasamak;
        while (geciciSayi != 0) {
            sonBasamak = geciciSayi % 10;
            tersSayi = tersSayi * 10 + sonBasamak;
            geciciSayi /= 10;
        }

        if (sayi == tersSayi) return true;
        else return false;
    }

    public static void main(String[] args) {
        int s;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        s = input.nextInt();

        if (palindrom(s)) System.out.println(s + " palindrom bir sayıdır.");
        else System.out.println(s + " palindrom bir sayı değildir.");
    }
}
