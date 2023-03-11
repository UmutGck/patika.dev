import java.util.Scanner;

public class RecursiveUs {
    static int us(int t, int u) {
        if (u < 1) return 1;
        else return t * us(t, u-1);
    }

    public static void main(String[] args) {
        int t, u;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        t = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        u = input.nextInt();

        System.out.println("Sonuç: " + us(t, u));
    }
}
