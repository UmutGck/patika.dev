import java.util.Scanner;

public class DaireDilimininAlaniniHesaplama {
    public static void main(String[] args)  {
        double r, a, alan, pi;
        // pi = Math.PI;
        pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();

        alan = (pi * Math.pow(r, 2) * a) / 360;

        System.out.println("Daire diliminin alanı: " + alan);
    }
}
