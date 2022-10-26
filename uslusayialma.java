import java.util.Scanner;
public class uslusayialma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n, r,i;

        System.out.print("Üssü alınacak sayı: ");
        n = girdi.nextInt();
        System.out.print("Üs olacak sayı: ");
        r = girdi.nextInt();
        int toplam=n;

        for(i=1; i<r;i++){
            toplam = (n*toplam);}

        System.out.println(toplam);
    }
}
