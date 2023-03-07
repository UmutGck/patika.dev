import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, ortalamayaDahilEdilenDersSayisi = 0, ortalamayaDahilEdilenDersPuanlari = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            ortalamayaDahilEdilenDersPuanlari += matematik;
            ortalamayaDahilEdilenDersSayisi += 1;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            ortalamayaDahilEdilenDersPuanlari += fizik;
            ortalamayaDahilEdilenDersSayisi += 1;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            ortalamayaDahilEdilenDersPuanlari += turkce;
            ortalamayaDahilEdilenDersSayisi += 1;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            ortalamayaDahilEdilenDersPuanlari += kimya;
            ortalamayaDahilEdilenDersSayisi += 1;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            ortalamayaDahilEdilenDersPuanlari += muzik;
            ortalamayaDahilEdilenDersSayisi += 1;
        }

        if (ortalamayaDahilEdilenDersSayisi != 0) {
            ortalama = ortalamayaDahilEdilenDersPuanlari / ortalamayaDahilEdilenDersSayisi;
        } else {
            ortalama = 0;
        }

        if (ortalama <= 55) {
            System.out.println("Ne yazık ki " + ortalama + " ortalama ile sınıfta kaldınız");
        } else {
            System.out.println("Tebrikler! Sınıfı " + ortalama + " ortalama ile geçmeyi başardınız.");
        }
    }
}
