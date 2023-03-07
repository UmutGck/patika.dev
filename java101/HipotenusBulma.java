import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenüsün uzunluğu: " + c);
    }
}
