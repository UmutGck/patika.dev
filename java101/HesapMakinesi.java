import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, operation;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");

        System.out.print("Seçiminiz nedir?: ");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.println(n1 / n2);
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
                break;
        }
    }
}
