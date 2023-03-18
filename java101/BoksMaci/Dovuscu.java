public class Dovuscu {
    String isim;
    int hasar;
    int can;
    int kilo;
    int dodge;

    Dovuscu(String isim, int hasar, int can, int kilo, int dodge) {
        this.isim = isim;
        this.hasar = hasar;
        this.can = can;
        this.kilo = kilo;
        this.dodge = dodge;
    }

    int vur(Dovuscu rakip) {
        System.out.println(this.isim + " => " + rakip.isim + " " + this.hasar + " hasar vurdu.");
        if (rakip.isDodge()) {
            System.out.println(rakip.isim + " gelen hasarı blokladı.");
            return rakip.can;
        }
        if (rakip.can - this.hasar < 0)
            return 0;
        else
            return rakip.can - this.hasar;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
