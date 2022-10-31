import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        Ogretmen matematik = new Ogretmen("Samet", "05310000000", "Matematik");
        Ogretmen turkce = new Ogretmen("Mine", "05310000000", "Türkçe");
        Ogretmen tarih = new Ogretmen("Mahmut", "05310000000", "Tarih");

        Ders mat = new Ders("Mat", "Samet", "101", 301);
        Ders turk = new Ders("Turk", "Mine", "102", 302);
        Ders trh = new Ders("TRH", "Mahmut", "103", 303);

        Ogrenci zel = new Ogrenci("Zel", "10", "8/A");
        Ogrenci dal = new Ogrenci("dal", "11", "8/B");
        Ogrenci kal = new Ogrenci("kal", "12", "8/C");


        String metin = "Seçim yapın: \n" +
                "1- Ders Bilgileri\n" +
                "2- Notlar";


        String metinders = "Ders seçimi yapın:\n" +
                "1- Türkçe\n" +
                "2- Matematik\n" +
                "3- Tarih";

        while (true) {
            System.out.println(metin);
            int secim = girdi.nextInt();

            if (secim == 1) {
                System.out.println(metinders);
                int secim2 = girdi.nextInt();
                if (secim2 == 1) {
                    turkce.ogretmenyazdir();
                    turk.dersyazdir();
                } else if (secim2 == 2) {
                    matematik.ogretmenyazdir();
                    mat.dersyazdir();
                } else if (secim2 == 3) {
                    tarih.ogretmenyazdir();
                    trh.dersyazdir();
                } else {
                    System.out.println("Yanlış seçim yaptınız!");
                }
            }
            if (secim == 2) {
                System.out.print("Öğrenci numaranızı girin: ");
                int ogrencino = girdi.nextInt();
                if (ogrencino == 10) {
                    zel.butunnotlar(55, 57, 60, 45, 85, 10);
                    zel.notyazdir();
                } else if (ogrencino == 11) {
                    dal.butunnotlar(45, 65, 85, 95, 62, 40);
                    dal.notyazdir();


                } else if (ogrencino == 12) {

                    kal.butunnotlar(54, 57, 68, 56, 68, 45);
                    kal.notyazdir();
                } else {
                    System.out.println("Yanlış numara girdiniz!");
                    System.out.println("---------------------------------------------");
                }
            }
        }


    }
}