import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil;
        String cinZodyagiDegeri = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğdunuz yılı giriniz: ");
        yil = input.nextInt();

        switch (yil % 12) {
            case 0:
                cinZodyagiDegeri = "Maymun";
                break;
            case 1:
                cinZodyagiDegeri = "Horoz";
                break;
            case 2:
                cinZodyagiDegeri = "Köpek";
                break;
            case 3:
                cinZodyagiDegeri = "Domuz";
                break;
            case 4:
                cinZodyagiDegeri = "Fare";
                break;
            case 5:
                cinZodyagiDegeri = "Öküz";
                break;
            case 6:
                cinZodyagiDegeri = "Kaplan";
                break;
            case 7:
                cinZodyagiDegeri = "Tavşan";
                break;
            case 8:
                cinZodyagiDegeri = "Ejderha";
                break;
            case 9:
                cinZodyagiDegeri = "Yılan";
                break;
            case 10:
                cinZodyagiDegeri = "At";
                break;
            case 11:
                cinZodyagiDegeri = "Koyun";
                break;
        }
        
        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagiDegeri);
    }
}
