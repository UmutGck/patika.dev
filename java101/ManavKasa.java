import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplamTutar;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo?: ");
        armutKilo = input.nextInt();

        System.out.print("Elma Kaç Kilo?: ");
        elmaKilo = input.nextInt();

        System.out.print("Domates Kaç Kilo?: ");
        domatesKilo = input.nextInt();

        System.out.print("Muz Kaç Kilo?: ");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo?: ");
        patlicanKilo = input.nextInt();

        toplamTutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam tutar: " + toplamTutar + " TL");
    }
}
