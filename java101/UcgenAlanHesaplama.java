import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        double a, b, c, cevre, u, alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextDouble();

        System.out.print("Üçüncü kenarı giriniz: ");
        c = input.nextDouble();

        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
