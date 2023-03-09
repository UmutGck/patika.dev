import java.util.Scanner;

public class UceVeDordeTamBolunenSayilar {
    public static void main(String[] args) {
        int k, adet = 0, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                adet += 1;
                toplam += i;
            }
        }

        System.out.println("0'dan girdiğiniz sayıya kadar olan sayılardan, 3'e ve 4'e tam bölünebilen sayıların ortalaması: " + (toplam / adet));
    }
}
