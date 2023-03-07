import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int derece;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        derece = input.nextInt();

        if (derece < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (derece >= 5 && derece <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (derece >= 15 && derece <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
