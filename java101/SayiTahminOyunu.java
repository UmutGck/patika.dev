import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean bulundu = false;
        int tahmin;
        int[] yanlisTercihler = new int[5];
        int tahminEdilecekSayi = rand.nextInt(100), tahminSayisi = 5;

        System.out.println("Sizden 0 ve 100 arasında bir tahminde bulunmanızı bekliyoruz.");

        while (tahminSayisi != 0) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            tahmin = input.nextInt();

            if (tahmin < 0 || tahmin > 99) {
                System.out.println("Lütfen tahmininiz 0 ve 100 arasında olsun");
            }
            else if (Arrays.asList(yanlisTercihler).contains(tahmin)) {
                System.out.println("Lütfen daha önceden girmiş olmadığınız bir sayıyı giriniz.");
            } else {
                if (tahmin == tahminEdilecekSayi) {
                    bulundu = true;
                    break;
                } else if (tahmin < tahminEdilecekSayi) {
                    System.out.println("Daha yüksek bir sayı giriniz.");
                } else {
                    System.out.println("Daha düşük bir değer giriniz.");
                }
                yanlisTercihler[--tahminSayisi] = tahmin;
                System.out.println(tahminSayisi + " hakkınız kaldı!\n");
            }
        }

        if (bulundu) {
            System.out.println("Tebrikler! Doğru tahmin.");
        } else {
            System.out.println("Maalesef bulamadınız. Doğru sayı: " + tahminEdilecekSayi);
            System.out.println("Sizin tahminleriniz şu şekildeydi: " + Arrays.toString(yanlisTercihler));
        }
    }
}
