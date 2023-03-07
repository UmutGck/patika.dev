import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double kdvsizFiyat, kdvOrani, kdvTutari, kdvliFiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyatı giriniz: ");
        kdvsizFiyat = input.nextDouble();

        kdvOrani = (kdvsizFiyat >= 0) && (kdvsizFiyat <= 1000) ? 0.18 : 0.08;

        kdvTutari = kdvsizFiyat * kdvOrani;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz fiyat: " + kdvsizFiyat);
        System.out.println("KDV oranı: " + kdvOrani);
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV'li fiyat:" + kdvliFiyat);
    }
}
