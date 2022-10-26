import java.util.Scanner;
public class kullaniciadigiriswhile {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String sifre,kullaniciadi;
        boolean sifredogru = false,kadidogru = false;


        while (!sifredogru){
            System.out.print("Kullanıcı Adı: ");
            kullaniciadi = girdi.nextLine();
            System.out.print("Şifre: ");
            sifre = girdi.nextLine();
            if ((sifre.equals("123"))&&(kullaniciadi.equals("samet"))){
                System.out.println("Giriş yapılıyor...");
                sifredogru = true;}
            else {
                System.out.println("Kullanıcı adı veya şifre yanlış!");
            }
        }


    }
}
