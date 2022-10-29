import java.util.Scanner;
public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n1;
        int toplam=0;
        int loop1=0,loop2=0;

        while (loop1==loop2){
        System.out.print("Bir sayı girin: ");
        n1 = girdi.nextInt();

        for (int i = 1; i<n1; i++){
        if (n1%i==0){
            toplam = toplam+i;}
        }
        if (toplam==n1){
            System.out.println(n1+" Mükemmel sayıdır.");
            System.out.println("------------------------------");
        }else {
            System.out.println(n1+" Mükemmel sayı değildir.");
            System.out.println("------------------------------");
        }
        toplam=0;}
    }
}
