public class Ogrenci {

    String isim;
    String ogrencinum;
    String sinif;
    int ders1, dersbir, dersiki, ders2, ders3, dersuc;
    double ortalama;

    Ogrenci(String isim, String ogrencinum, String sinif) {
        this.isim = isim;
        this.ogrencinum = ogrencinum;
        this.sinif = sinif;


    }

    void ogrencikimlik() {
        this.isim = isim;
        this.ogrencinum = ogrencinum;
        this.sinif = sinif;

    }

    void butunnotlar(int ders1, int dersbir, int dersiki, int ders2, int ders3, int dersuc) {
        this.ders1 = ders1;
        this.ders2 = ders2;
        this.ders3 = ders3;
        this.dersbir = dersbir;
        this.dersiki = dersiki;
        this.dersuc = dersuc;
    }

    void ortalamahesap() {
        this.ortalama = ortalama;
        ortalama = (((ders1 * 0.80) + (dersbir * 0.20)) + (((ders2 * 0.80) + (dersiki * 0.20)) + ((ders3 * 0.80) + (dersuc * 0.20)))) / 3;
        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        } else {
            System.out.println("Kaldınız.");
        }
    }

    void notyazdir() {
        System.out.println("*" + isim + "-" + ogrencinum + "-" + sinif + "*");
        System.out.println();
        System.out.println("Matematik: " + ((ders1 * 0.80) + (dersbir * 0.20)));
        System.out.println("Türkçe: " + ((ders2 * 0.80) + (dersiki * 0.20)));
        System.out.println("Tarih: " + ((ders3 * 0.80) + (dersuc * 0.20)));
        ortalamahesap();
        System.out.println();
        System.out.println();
        System.out.println();

    }

}
