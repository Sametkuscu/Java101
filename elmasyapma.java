import java.util.Scanner;
public class elmasyapma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = girdi.nextInt();


        for (int i = 1; i <= sayi; i++) {

            System.out.println();

            for (int b = 1; b<= (sayi-i); b++)
            {
                System.out.print(" ");
            }
            for (int c = 1; c<=(2*i)-1;c++){
                System.out.print("*");
            }
        }
        for (int d = sayi; 0 <= d; d--) {

            System.out.println();

            for (int b = 1; b<=sayi-d; b++)
            {
                System.out.print(" ");
            }
            for (int c = 1; c<=(2*d)-1; c++){
                System.out.print("*");
            }
        }

    }
}
