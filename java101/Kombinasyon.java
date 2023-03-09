import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, nFaktoriyel = 1, rFaktoriyel = 1, nEksiRFaktoriyel = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Asıl kümenin eleman sayıyını giriniz: ");
        n = input.nextInt();

        System.out.print("Alt kümelerin eleman sayısını giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        for (int j = 1; j <= r; j++) {
            rFaktoriyel *= j;
        }

        for (int k = 1; k <= (n-r); k++) {
            nEksiRFaktoriyel *= k;
        }

        System.out.println("Kombinasyon: " + nFaktoriyel / (rFaktoriyel * nEksiRFaktoriyel));
    }
}
