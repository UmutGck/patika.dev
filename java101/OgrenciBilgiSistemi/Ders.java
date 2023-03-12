public class Ders {
    Ogretmen ogretmen;
    String isim, kod, prefix;
    int not, sozlu;
    double notEtkisi, sozluEtkisi;

    Ders(String isim, String kod, String prefix, double notEtkisi, double sozluEtkisi) {
        this.isim = isim;
        this.kod = kod;
        this.prefix = prefix;
        this.not = 0;
        this.sozlu = 0;
        this.notEtkisi = notEtkisi;
        this.sozluEtkisi = sozluEtkisi;
    }

    void dersinOgretmeniIleIlgiliBilgiBas () {
        this.ogretmen.ogretmenHakkindaBilgiVer();
    }

    void ogretmenAta(Ogretmen ogretmen) {
        if (ogretmen.bolum.equals(this.prefix)) {
            this.ogretmen = ogretmen;
            dersinOgretmeniIleIlgiliBilgiBas();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }
}
