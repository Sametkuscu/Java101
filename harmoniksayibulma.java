import java.util.Scanner;
public class harmoniksayibulma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        double sayi = girdi.nextInt();
        double sonuc = 0;
        double i = 1;
        double toplam=0;

        while (i<=sayi){
            sonuc=1/i;
            i++;
            toplam=toplam+sonuc;
        }
        System.out.println(toplam);
    }
}
