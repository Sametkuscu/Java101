import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç km?: ");
        int KM = girdi.nextInt();
        double ucret = 2.20;
        double enfazlaucret = (KM*ucret) + 10;
        boolean encok = enfazlaucret >=20;
        double enazucret = (encok)? enfazlaucret:20;

        System.out.println("Yolculuk tutarı:" + enazucret);
    }
}
