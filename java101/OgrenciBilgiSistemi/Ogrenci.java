public class Ogrenci {
    Ders d1, d2, d3;
    String isim, ogrenciNumarasi;
    double ortalama;

    Ogrenci(String isim, String ogrenciNumarasi, Ders d1, Ders d2, Ders d3) {
        this.isim = isim;
        this.ogrenciNumarasi = ogrenciNumarasi;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ortalama = 0.0;
    }

    void notlariEkle(int not1, int sozlu1, int not2, int sozlu2, int not3, int sozlu3) {
        if (not1 >= 0 && not1 <= 100 && sozlu1 >= 0 && sozlu1 <= 100) {
            this.d1.not = not1;
            this.d1.sozlu = sozlu1;
        }
        if (not2 >= 0 && not2 <= 100 && sozlu2 >= 0 && sozlu2 <= 100) {
            this.d2.not = not2;
            this.d2.sozlu = sozlu2;
        }
        if (not3 >= 0 && not3 <= 100 && sozlu3 >= 0 && sozlu3 <= 100) {
            this.d3.not = not3;
            this.d3.sozlu = sozlu3;
        }
    }

    void notBas() {
        System.out.println(this.d1.isim + " notu: " + ((this.d1.not * this.d1.notEtkisi) + (this.d1.sozlu * this.d1.sozluEtkisi)));
        System.out.println(this.d2.isim + " notu: " + ((this.d2.not * this.d2.notEtkisi) + (this.d2.sozlu * this.d2.sozluEtkisi)));
        System.out.println(this.d3.isim + " notu: " + ((this.d3.not * this.d3.notEtkisi) + (this.d3.sozlu * this.d3.sozluEtkisi)));
        System.out.println("Ortalama: " + this.ortalama + "\n");
    }

    void gectiMi() {
        this.ortalama = (((this.d1.not * this.d1.notEtkisi) + (this.d1.sozlu * this.d1.sozluEtkisi)) + ((this.d2.not * this.d2.notEtkisi) + (this.d2.sozlu * this.d2.sozluEtkisi)) + ((this.d3.not * this.d3.notEtkisi) + (this.d3.sozlu * this.d3.sozluEtkisi))) / 3.0;
        if (this.ortalama > 55) {
            System.out.println(this.isim + " sınıfı geçti.");
        } else {
            System.out.println(this.isim + " sınıfta kaldı.");
        }
        notBas();
    }
}