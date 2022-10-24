import java.util.Scanner;
public class Alanodev {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double pi = 3.14;
        int r,a;
        System.out.print("Dairenin yarıçapı: ");
        r = girdi.nextInt();
        System.out.print("Dairenin merkez açısı ölçüsü: ");
        a = girdi.nextInt();
        double sonuc = (pi*(r*r)*a)/360;
        System.out.println("Sonuç: " +sonuc);
    }
}
