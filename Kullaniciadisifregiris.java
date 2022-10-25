import java.util.Scanner;
public class Kullaniciadisifregiris {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String kullaniciadi, sifre;
        System.out.print("Kullanıcı Adı: ");
        kullaniciadi = girdi.nextLine();
        System.out.print("Sifre: ");
        sifre = girdi.nextLine();

        if(kullaniciadi.equals("Samet") && (sifre.equals("java101"))) {
            System.out.print("Sisteme giriş yapıldı.");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış! Tekrar deneyin.");
            System.out.println("Şifrenizi sıfırlamak istiyorsanız 1 yazın.");
            String sifirlama = girdi.nextLine();
            System.out.println("Yeni şifrenizi girin: ");
            String yenisifre = girdi.nextLine();
            if (yenisifre.equals("java101")){
                System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz!");}
                else
                System.out.print("Şifreniz başarıyla oluşturuldu.");
            }
        }

    }









