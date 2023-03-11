import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int a, b, kucuk, buyuk, k_, b_;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        int ebob = 1, ekok = a * b;

        if (a <= b) {
            kucuk = a;
            buyuk = b;
        }
        else {
            kucuk = b;
            buyuk = a;
        }

        // ebob
        k_ = kucuk;

        while (k_ >= 1) {
            if (a % k_ == 0 && b % k_ == 0) {
                ebob = k_;
                break;
            }
            k_--;
        }

        // ekok
        k_ = kucuk;
        b_ = buyuk;

        while (k_ < a * b) {
            if (b_ % k_ == 0) {
                ekok = k_;
                break;
            }
            k_ += kucuk;
            if (k_ > b_) b_ += buyuk;
        }

        System.out.println("Girdiğiniz sayıların ebob'u: " + ebob);
        System.out.println("Girdiğiniz sayıların ekok'u: " + ekok);
    }
}
