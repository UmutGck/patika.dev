import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int ay, gun;
        boolean error = false;
        String burc = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();
        while ((gun < 1) || (gun > 31)) {
            System.out.print("Doğru bir gün bilgisi girmediniz. Lütfen tekrar deneyiniz: ");
            gun = input.nextInt();
        }

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();
        while ((ay < 1) || (ay > 12)) {
            System.out.print("Doğru bir ay bilgisi girmediniz. Lütfen tekrar deneyiniz: ");
            ay = input.nextInt();
        }

        if (ay == 1) {
            if (gun <= 21) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (ay == 2) {
            if (gun <= 29) {
                if (gun <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                error = true;
            }
        } else if (ay == 3) {
            if (gun <= 20) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (ay == 4) {
            if (gun <= 30) {
                if (gun <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                error = true;
            }
        } else if (ay == 5) {
            if (gun <= 21) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (ay == 6) {
            if (gun <= 30) {
                if (gun <= 22) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                error = true;
            }
        } else if (ay == 7) {
            if (gun <= 22) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else if (ay == 8) {
            if (gun <= 22) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (ay == 9) {
            if (gun <= 30) {
                if (gun <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                error = true;
            }
        } else if (ay == 10) {
            if (gun <= 22) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (ay == 11) {
            if (gun <= 30) {
                if (gun <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                error = true;
            }
        } else {
            if (gun <= 21) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        }

        if (error) {
            System.out.println("Girdiğiniz gün bilgisi takvimde bulunmamaktadır. Lütfen bilgilerinizi kontrol ederek tekrar deneyiniz.");
        } else {
            System.out.println("Bilgileriniz başarıyla alınmıştır.\nBurcunuz: " + burc);
        }
    }
}
