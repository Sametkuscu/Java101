import java.util.Scanner;
public class Alanbulma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yarıçapı kaç?: ");
        int r = girdi.nextInt();
        double pi = 3.14;
        double cevre = ((2*pi) * r);
        double alan = pi*r*r;
        double dairedilimialani = (pi*(r*r)*(cevre/2))/360;
        System.out.println("Dairenin çevresi: " +cevre);
        System.out.println("Dairenin alanı: " +alan);
    }
}
