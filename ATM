import javax.sound.sampled.Line;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String tc,sifre;

        boolean sifredogru = false;
        int yanlis=0;
        int kalanhak=3;
        double toplampara=1000;
        while (!sifredogru) {

            if(yanlis<3){
            System.out.print("T.C. Kimlik No: ");
            tc = girdi.nextLine();
            System.out.print("Şifre: ");
            sifre = girdi.nextLine();

            if ((tc.equals("1907")) && (sifre.equals("5252"))) {
                sifredogru = true;
            } else {
                yanlis++;
                kalanhak--;
                System.out.println("T.C. Kimlik numaranız ya da şifreniz yanlış!");
                System.out.println("Kalan hakkınız: "+kalanhak);
                System.out.println("---------------------------------------------------");}
            }
            else {
            System.out.println("T.C. Kimlik numaranızı ya da sifrenizi 3 kez yanlış girdiniz. Kartınız bloke edildi.");
            break;}
        }




        if(sifredogru==true){
            int islembas = 0;
                while (islembas!=4){
                    islembas=0;
            System.out.println("1-Para çek. / 2-Para yükle. / 3-Bakiyeni gör. / 4-Çıkış!");
            int islem = girdi.nextInt();

                if(islem==1){
                    System.out.print("Çekmek istediğiniz tutarı girin: ");
                    double tutar = girdi.nextDouble();
                    toplampara=toplampara-tutar;
                    System.out.println("Hesabınızdan "+tutar+" tl çekildi.");

                    System.out.println("Hesabınızda kalan tutar: "+toplampara);
                    System.out.println("---------------------------------------------------");
                }else if (islem==2){
                    System.out.print("Yatırmak istediğiniz tutarı girin: ");
                    double tutar = girdi.nextDouble();
                    toplampara=toplampara+tutar;
                    System.out.println("Hesabınıza "+tutar+" tl yatırıldı.");

                    System.out.println("Hesabınızdaki tutar: "+toplampara);
                    System.out.println("---------------------------------------------------");
                } else if (islem==3) {
                    System.out.println("Hesabınızdaki tutar: "+toplampara);
                    System.out.println("---------------------------------------------------");
                } else if (islem==4) {
                    System.out.println("Görüşmek üzere. :)");
                }}
        }
    }
}
