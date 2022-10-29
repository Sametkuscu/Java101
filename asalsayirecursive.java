import java.util.Scanner;

public class asalsayirecursive {

    static void asal(int a, int i) {

        if (i==a){

            System.out.println(a+" asal sayıdır.");
            return;
        } else if (a%i==0) {
            System.out.println(a+" asal sayı değildir.");
            return;
        }
        asal(a,i+1);
    }

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);


        System.out.print("Bir sayı girin: ");
        int sayi = girdi.nextInt();
        asal(sayi,2);
    }
}
