import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void topla(int a, int b) {
        int toplam = a + b;
        System.out.println("Toplama işleminin sonucu: " + toplam);
    }

    static void cikar(int a, int b) {
        int fark = a - b;
        System.out.println("Çıkarma işleminin sonucu: " + fark);
    }

    static void carp(int a, int b) {
        int carpim = a * b;
        System.out.println("Çarpım işleminin sonucu: " + carpim);
    }

    static void bol(double a, int b) {
        if (b == 0) {
            System.out.println("Bölen sayı 0'a eşit olamaz. Lütfen bölen sayıya başka bir değer giriniz.");
        } else {
            double bolum = a / b;
            System.out.println("Bölme işleminin sonucu: " + bolum);
        }
    }

    static void ust(int a, int b) {
        int usluIfade = 1;

        for (int i = 1; i <= b; i++) {
            usluIfade *= a;
        }

        System.out.println("Üslü sayı hesaplama işleminin sonucu: " + usluIfade);
    }

    static void mod(int a, int b) {
        int mod = a % b;
        System.out.println("Mod sonucu: " + mod);
    }

    static void dikdortgen(int a, int b) {
        int alan, cevre;
        alan = a * b;
        cevre = 2 * (a + b);

        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    public static void main(String[] args) {
        int sec, a, b;
        Scanner input = new Scanner(System.in);

        String menu = "1 - Toplama İşlemi\n"
                    + "2 - Çıkarma İşlemi\n"
                    + "3 - Çarpma İşlemi\n"
                    + "4 - Bölme İşlemi\n"
                    + "5 - Üslü Sayı Hesaplama\n"
                    + "6 - Mod Alma\n"
                    + "7 - Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "8 - Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir işlem seçiniz: ");

            sec = input.nextInt();

            if (sec == 8) {
                break;
            }

            System.out.print("İlk sayıyı giriniz: ");
            a = input.nextInt();

            System.out.print("İkinci sayıyı giriniz: ");
            b = input.nextInt();

            switch (sec) {
                case 1:
                    topla(a, b);
                    break;
                case 2:
                    cikar(a, b);
                    break;
                case 3:
                    carp(a, b);
                    break;
                case 4:
                    bol(a, b);
                    break;
                case 5:
                    ust(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    dikdortgen(a, b);
                    break;
                default:
                    System.out.println("Yanlış bir tuşa bastınız. Bir daha deneyiniz.");
            }
        }

        System.out.println("Gelişmiş hesap makinemizi kullandığınız için teşekkür ederiz.");
    }
}
