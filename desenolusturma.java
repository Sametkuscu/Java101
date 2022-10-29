import java.util.Scanner;

public class desenolusturma {

    static int desen(int sayi) {

        if (sayi <= 0) {

            return sayi;
        } else {
            System.out.print(sayi + " ");
            return desen(desen(sayi - 5));
        }
    }

    static int desen2(int sayi, int i) {
        if (sayi > i) {
            return sayi;
        } else {
            System.out.print(sayi + " ");
            return desen2(sayi + 5, i);
        }
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        while (true){
        System.out.print("Sayı girin: ");
        int a = girdi.nextInt();
        desen2(desen(a), a);
        if (a == 0) {
            break;
        }
            System.out.println();
            System.out.println("Çıkış '0': ");
        }
    }
}
