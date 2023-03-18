public class Mac {
    Dovuscu d1;
    Dovuscu d2;
    int minAgirlik;
    int maxAgirlik;

    Mac(Dovuscu d1, Dovuscu d2, int minAgirlik, int maxAgirlik) {
        this.d1 = d1;
        this.d2 = d2;
        this.minAgirlik = minAgirlik;
        this.maxAgirlik = maxAgirlik;
    }

    public void run() {
        if (isCheck()) {
            double randomNumber = Math.random() * 100;
            if (randomNumber > 50) {
                System.out.println(this.d1.isim + " dövüşe başlıyor.");
                while (this.d1.can > 0 && this.d2.can > 0) {
                    this.d2.can = this.d1.vur(d2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.d2.isim + " Sağlık: " + this.d2.can);
                    this.d1.can = this.d2.vur(d1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.d1.isim + " Sağlık: " + this.d1.can);
                }
            } else {
                System.out.println(this.d2.isim + " dövüşe başlıyor.");
                while (this.d1.can > 0 && this.d2.can > 0) {
                    this.d1.can = this.d2.vur(d1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.d1.isim + " Sağlık: " + this.d1.can);
                    this.d2.can = this.d1.vur(d2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.d2.isim + " Sağlık: " + this.d2.can);
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.d1.kilo >= minAgirlik && this.d1.kilo <= maxAgirlik) && (this.d2.kilo >= minAgirlik && this.d2.kilo <= maxAgirlik);
    }

    boolean isWin() {
        if (this.d1.can == 0) {
            System.out.println(this.d2.isim + " kazandı.");
            return true;
        }

        if (this.d2.can == 0) {
            System.out.println(this.d1.isim + " kazandı.");
            return true;
        }

        return false;
    }
}
