import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean artik = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz: ");
        yil = input.nextInt();

        if (yil % 400 == 0) {
            artik = true;
        } else if ((yil % 4 == 0) && (yil % 100 != 0)) {
            artik = true;
        }

        if (artik) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}
