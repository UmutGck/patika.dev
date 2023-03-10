import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        int kalanHak = 3, bakiye = 1000, islem, price;
        Scanner input = new Scanner(System.in);

        while (kalanHak > 0) {
            System.out.print("Kullanıcı adınız: ");
            kullaniciAdi = input.nextLine();

            System.out.print("Şifreniz: ");
            sifre = input.nextLine();

            if ((kullaniciAdi.equals("Doğu")) && (sifre.equals("dogu123"))) {
                System.out.println("Sisteme giriş yaptınız.");
                System.out.println("Para Bankası'na hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1- Para yatırma\n2- Para çekme\n3- Bakiye sorgula\n4- Çıkış yap");
                    islem = input.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.print("Yatırılacak para miktarı: ");
                            price = input.nextInt();
                            bakiye += price;
                            System.out.println(price + "TL hesabınıza yatırılmıştır.");
                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarı: ");
                            price = input.nextInt();
                            if (price > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= price;
                                System.out.println(price + "TL hesabınızdan çekilmiştir.");
                            }
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz: " + bakiye + "TL");
                            break;
                    }
                } while (islem != 4);
                System.out.println("Para Bankası'nı kullandığınız için teşekkür ederiz. Tekrar görüşmek üzere!");
                break;
            } else {
                kalanHak--;
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                switch (kalanHak) {
                    case 0:
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçin.");
                    default:
                        System.out.println("Kalan hakkınız: " + kalanHak);
                }
            }
        }
    }
}
