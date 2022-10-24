import java.util.Scanner;
public class Taksimetre2 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Gideceğiniz yer kaç km?: ");
        int km = girdi.nextInt();
        int startPrice = 10;
        double perKm = 2.20;
        double toplam = (km*perKm) + startPrice;
        double toplam2 = (toplam<20)? 20: toplam;
        System.out.print("Ödeyeceğiniz tutar: " + toplam2 + " tl");
    }

}
