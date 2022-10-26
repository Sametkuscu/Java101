import java.util.Scanner;
public class ucakbiletiprogrami {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double km,yas,tip,toplam,kmbasi,yuzdeon;
        kmbasi = 0.10;
        System.out.print("Yaşınız: ");
        yas = girdi.nextDouble();
        if (yas>=1) {}
            else {
            System.out.println("Yanlış seçim yaptınız!");}

        System.out.print("Mesafe: ");
        km = girdi.nextDouble();

        if (km>=1) {}
        else {
            System.out.println("Yanlış seçim yaptınız!");}

        System.out.print("Yolculuk tipi(1:Gidiş / 2:Gidiş & Geliş): ");
        tip = girdi.nextDouble();

        if ((tip==1) || (tip==2)) {}
        else {
            System.out.println("Yanlış seçim yaptınız!");}

        toplam = km*kmbasi;

        if (yas<12){
            toplam = (toplam/2);}
            else if ((yas>=12) && (yas<=24)) {
            toplam = ((toplam*90)/100);}
            else if (yas>=65) {
            toplam = ((toplam*70)/100);}
        if (tip==1){
            System.out.println(toplam);}
            else if (tip==2) {
            toplam = ((toplam*80)/100);
            System.out.println(toplam);}
    }
    }
