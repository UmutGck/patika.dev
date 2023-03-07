import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, indeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        indeks = kilo / Math.pow(boy, 2);
        System.out.println("Vücut kitle indeksiniz: " + indeks);
    }
}
