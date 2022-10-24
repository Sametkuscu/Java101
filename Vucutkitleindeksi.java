import java.util.Scanner;
public class Vucutkitleindeksi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double boy, agirlik;
        System.out.print("Boyunuz: ");
        boy = girdi.nextDouble();
        System.out.print("Kilonuz: ");
        agirlik = girdi.nextDouble();
        double sonuc = agirlik/(boy*boy);
        System.out.print("Vücut kütle indeksiniz: "+sonuc);
    }
}
