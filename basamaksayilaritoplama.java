import java.util.Scanner;
public class basamaksayilaritoplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int sayi = girdi.nextInt();
        int sonuc = 0;
        int toplam=0;
        while (sayi!=0){
            sonuc=sayi % 10;
            sayi=sayi/10;
            toplam=sonuc+toplam;}
            System.out.println(toplam);
    }
}
