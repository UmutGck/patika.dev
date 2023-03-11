import java.util.Scanner;

public class RecursiveAsal {
    static boolean asal(int n, int i) {
        if (n < 2) return true;
        if (n == 2) return false;
        if (n % i == 0) return false;
        if (i * i > n) return true;

        return asal(n, i + 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz: ");
        n = input.nextInt();

        if (asal(n, 2)) System.out.println(n + " asal bir sayıdır.");
        else System.out.print(n + " asal bir sayı değildir.");
    }
}
