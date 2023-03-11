import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamak;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        basamak = input.nextInt();

        for (int i = 0; i < basamak; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * basamak - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
