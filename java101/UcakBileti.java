import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi giriniz: ");
        mesafe = input.nextInt();
        while (mesafe <= 0) {
            System.out.print("Yanlış bir mesafe bilgisi girdiniz. Lütfen tekrar bilgi veriniz: ");
            mesafe = input.nextInt();
        }

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        while (yas <= 0) {
            System.out.print("Yanlış bir yaş bilgisi girdiniz. Lütfen tekrar bilgi veriniz: ");
            yas = input.nextInt();
        }

        System.out.print("Yolculuk tipinizi seçiniz. (1 -> Tek yön 2 -> Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();
        while((yolculukTipi != 1) && (yolculukTipi != 2)) {
            System.out.println("Yolculuk tipi yalnızca 1 veya 2 değerini alabilir");
            System.out.print("Lütfen yolculuk tipinizi tekrar seçiniz. (1 -> Tek yön 2 -> Gidiş-Dönüş): ");
            yolculukTipi = input.nextInt();
        }

        toplamTutar = mesafe * 0.1;

        if (yas < 12) {
            toplamTutar *= 0.5;
        } else if ((yas >= 12) && (yas <= 24)) {
            toplamTutar *= 0.9;
        } else if (yas > 65) {
            toplamTutar *= 0.7;
        }

        if (yolculukTipi == 2) {
            toplamTutar *= 0.8;
            toplamTutar *= 2;
        }

        System.out.println("Toplam tutar = " + toplamTutar);
    }
}
