public class Main {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen("Ali", "532 123 XX XX", "TRH");
        Ogretmen ogretmen2 = new Ogretmen("Ayşe", "539 456 XX XX", "MATH");
        Ogretmen ogretmen3 = new Ogretmen("Ahmet", "555 789 XX XX", "BIO");

        Ders tarih = new Ders("Tarih", "101", "TRH", 0.75, 0.25);
        Ders matematik = new Ders("Matematik", "101", "MATH", 0.8, 0.2);
        Ders biyoloji = new Ders("Biyoloji", "101", "BIO", 0.6, 0.4);

        tarih.ogretmenAta(ogretmen1);
        matematik.ogretmenAta(ogretmen2);
        biyoloji.ogretmenAta(ogretmen3);

        Ogrenci ogrenci1 = new Ogrenci("Doğu", "10", tarih, matematik, biyoloji);
        ogrenci1.notlariEkle(100, 100, 100, 100, 100, 100);
        ogrenci1.gectiMi();

        Ogrenci ogrenci2 = new Ogrenci("Utku", "11", tarih, matematik, biyoloji);
        ogrenci2.notlariEkle(75, 100, 85, 100, 90, 100);
        ogrenci2.gectiMi();

        Ogrenci ogrenci3 = new Ogrenci("Jack", "12", tarih, matematik, biyoloji);
        ogrenci3.notlariEkle(50, 50, 50, 50, 50, 50);
        ogrenci3.gectiMi();
    }
}