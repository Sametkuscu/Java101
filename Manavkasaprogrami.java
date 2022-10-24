import java.util.Scanner;
public class Manavkasaprogramı {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5;
        System.out.print("Kaç kilo armut: ");
        double armutkg = girdi.nextDouble();
        double armuttoplam = armutkg*armut;
        System.out.print("Kaç kilo elma: ");
        double elmakg = girdi.nextDouble();
        double elmatoplam = elmakg*elma;
        System.out.print("Kaç kilo domates: ");
        double domateskg = girdi.nextDouble();
        double domatestoplam = domateskg*domates;
        System.out.print("Kaç kilo muz: ");
        double muzkg = girdi.nextDouble();
        double muztoplam = muzkg*muz;
        System.out.print("Kaç kilo patlican: ");
        double patlicankg = girdi.nextDouble();
        double patlicantoplam = patlicankg*patlican;

        System.out.print("Toplam ödenecek tutar: "+ (armuttoplam+elmatoplam+patlicantoplam+muztoplam+domatestoplam));
        
    }
}
