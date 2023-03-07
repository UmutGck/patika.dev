import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args)  {
        String kullaniciAdi, sifre, sifirlamaTercihi, yeniSifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else if (kullaniciAdi.equals("patika") && !sifre.equals("java123")) {
            System.out.print("Şifreniz yanlış! Sıfırlamak ister misiniz? (Evet veya Hayır yazınız) ");
            sifirlamaTercihi = input.nextLine();
            if (sifirlamaTercihi.equals("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                yeniSifre = input.nextLine();
                while (yeniSifre.equals(sifre) || yeniSifre.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka bir şifre giriniz: ");
                    yeniSifre = input.nextLine();
                }
                sifre = yeniSifre;
                System.out.println("Yeni şifreniz başarıyla oluşturuldu.");
            } else if (sifirlamaTercihi.equals("Hayır")) {
                System.out.println("Şifrenizi sıfırlamayı tercih etmediniz.");
            } else {
                System.out.println("Yanlış bir tercihte bulundunuz.");
            }
        } else {
            System.out.println("Kullanıcı adı bilginizi kontrol ediniz.");
        }
    }
}
