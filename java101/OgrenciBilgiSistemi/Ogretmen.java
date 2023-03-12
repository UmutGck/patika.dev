public class Ogretmen {
    String isim, telefonNumarasi, bolum;

    Ogretmen(String isim, String telefonNumarasi, String bolum) {
        this.isim = isim;
        this.telefonNumarasi = telefonNumarasi;
        this.bolum = bolum;
    }

    void ogretmenHakkindaBilgiVer() {
        System.out.println("Öğretmen hakkındaki bilgiler:");
        System.out.println("Adı: " + this.isim);
        System.out.println("Telefon numarası: " + this.telefonNumarasi);
        System.out.println("Bölümü: " + this.bolum + "\n");
    }
}
