// "Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir."
// https://tr.wikipedia.org/wiki/Fibonacci_dizisi

import java.util.Scanner;

public class Fibonacci {
    // F(n)
    // F(0) = 0 if n = 0
    // F(1) = 1 if n = 1
    // F(n - 1) + F(n - 2) if n > 1
    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        n = input.nextInt();

        System.out.println(fib(n));
    }
}
