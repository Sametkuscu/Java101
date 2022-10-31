public class Ogretmen {

    String isim;
    String tel;
    String bolum;

    public Ogretmen(String isim, String tel, String bolum) {
        this.isim = isim;
        this.tel = tel;
        this.bolum = bolum;


    }

    void ogretmenyazdir() {
        System.out.println("Öğretmenin adı: " + isim);
        System.out.println("Öğretmenin bölümü: " + bolum);
        System.out.println("Öğretmenin Numarası: " + tel);

    }
}
