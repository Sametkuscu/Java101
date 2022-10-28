import java.util.Scanner;
public class ebob {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int sayi, sayi2;
        System.out.print("Bir sayı girin: ");
        sayi = girdi.nextInt();
        System.out.print("Bir sayı girin: ");
        sayi2 = girdi.nextInt();
        int ebob = 1;
        int ekok = 1;
        
        for (int i = 1; i <= sayi; i++) {
            if ((sayi % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
        }
        System.out.println("EBOB: "+ebob);
        
        for (int i = 1; i <= (sayi * sayi2); i++) {
            if ((i % sayi == 0) && (i % sayi2 == 0)) {
                ekok = i;
                break;
            }
        }
        System.out.println("EKOK: "+ekok);
    }
}
