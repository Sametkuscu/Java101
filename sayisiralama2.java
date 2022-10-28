import java.util.Scanner;
public class sayisiralama2 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int number,sayi,enkucuk = 0, enbuyuk = 0;

        System.out.print("Kaç sayı gireceksiniz?: ");
        number= girdi.nextInt();

        for (int i = 1; i<=number; i++) {
            System.out.print(i + ". Sayı: ");
            sayi = girdi.nextInt();

            if (i==1){
                enkucuk = sayi;
                enbuyuk = sayi;}
            else if (sayi>enbuyuk) {
                enbuyuk=sayi;}
            else if (sayi<enkucuk) {
                enkucuk=sayi;}
        }
        System.out.println(enbuyuk);
        System.out.println(enkucuk);
    }
}

