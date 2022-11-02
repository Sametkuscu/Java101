import java.util.Random;
import java.util.Scanner;

public class randomsayitahmin {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Random rastgele = new Random();
        int hata = 0;


            while (!(hata == 5)) {


                int sayi = rastgele.nextInt(100);
                System.out.print("Tahmininiz: ");
                int tahmin = girdi.nextInt();

                if(tahmin<=100&&tahmin>=0){
                if (tahmin == sayi) {
                    System.out.println("Tebrikler. Tahmininiz başarılı. :)");
                } else {
                    System.out.println("Malesef tahmininiz başarısız.");
                    System.out.println("Bilgisayarın tuttuğu sayı: " + sayi);
                    hata++;
                    if(hata==5){
                        System.out.println("Hakkınız doldu. Yeniden başlamak istiyorsanız '1'e basın.");
                        int tus = girdi.nextInt();
                        if(tus==1){
                            System.out.println("Yeniden başlıyor...");
                            hata=0;
                        }
                        else {
                            hata=5;
                        }
                    }
                }
            }
                else {
                    System.out.println("Girdiğiniz sayı 0-100 arasında olmalı.");
                }
                System.out.println("========================================================");
            }
    }
}
