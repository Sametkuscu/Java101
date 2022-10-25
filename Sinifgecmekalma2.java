import java.util.Scanner;
public class Sinifgecmekalma2 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double toplam=0, bolme=0, turkce, mat, fizik,kimya,muzik;

        System.out.print("Turkce notunuz kaç?: ");
        turkce = girdi.nextDouble();

        System.out.print("Matematik notunuz kaç?: ");
        mat = girdi.nextDouble();

        System.out.print("Fizik notunuz kaç?: ");
        fizik = girdi.nextDouble();

        System.out.print("Kimya notunuz kaç?: ");
        kimya = girdi.nextDouble();

        System.out.print("Müzik notunuz kaç?: ");
        muzik = girdi.nextDouble();

        if (turkce>=0 && turkce<=100){
            toplam = toplam+turkce;
            bolme = bolme+1;}
        if (mat>=0 && mat<=100){
            toplam = toplam+mat;
            bolme = bolme+1;}
        if (fizik>=0 && fizik<=100){
            toplam = toplam+fizik;
            bolme = bolme+1;}
        if (kimya>=0 && kimya<=100){
            toplam = toplam+kimya;
            bolme = bolme+1;}
        if (muzik>=0 && muzik<=100){
            toplam = toplam+muzik;
            bolme = bolme+1;}
        double sonuc = toplam/bolme;
        if (sonuc>=55){
            System.out.println("Tebrikler.Sınıfı geçtiniz.");}
            else {
            System.out.println("Üzgünüz. Sınıfta kaldınız.");
        }
        System.out.println(sonuc);
    }
}
