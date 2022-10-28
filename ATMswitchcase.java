import java.util.Scanner;
public class ATMswitchcase {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        boolean sifredogru=false;
        int yanlis = 0;
        String tc,sifre;
        int yanlissayisi=0;
        int kalanhak=3;
        while (!sifredogru) {

            if(yanlissayisi<3) {
                System.out.print("T.C. Kimlik numarası: ");
                tc = girdi.nextLine();
                System.out.print("Şifre: ");
                sifre = girdi.nextLine();


                if((tc.equals("12")&&(sifre.equals("13")))){
                    sifredogru=true;}
                else {
                    System.out.println("T.C. Kimlik numaranızı yada şifrenizi yanlış girdiniz.");
                    yanlissayisi++;
                    kalanhak--;}
            }
            else {
                System.out.println("T.C. Kimlik numaranızı ya da şifrenizi 3 kez yanlış girdiniz.");
                System.out.println("Kartınız bloke edildi!");
                break;
            }
            System.out.println("Kalan hakkınız: "+kalanhak);
            System.out.println("--------------------------------------------------");}

        if(sifredogru){
            int select=0;
            double paracek, parayukle, paragoster,toplampara=10000;
            while (select!=4){
            System.out.println("İşlemler: 1- Para çek.  2- Para yükle.  3-Bakiye sorgula.  4- Çıkış");
            select = girdi.nextInt();

            switch (select){
            case 1:
                System.out.print("Çekmek istediğiniz tutarı girin: ");
                paracek = girdi.nextDouble();
                toplampara = toplampara-paracek;
                System.out.println("Toplam bakiyeniz: "+toplampara);
                System.out.println("--------------------------------------------------");
                break;

                case 2:
                    System.out.print("Yüklemek istediğiniz tutarı girin: ");
                    parayukle = girdi.nextDouble();
                    toplampara= toplampara+parayukle;
                    System.out.println("Toplam bakiyeniz: "+toplampara);
                    System.out.println("--------------------------------------------------");
                    break;

                case 3:
                    System.out.println("Toplam bakiyeniz: "+toplampara);
                    System.out.println("--------------------------------------------------");
                break;

                case 4:
                    System.out.println("Görüşmek üzere. Tekrar bekleriz. :)");
                    System.out.println("--------------------------------------------------");
                    break;
                }
            }
        }
    }
}
