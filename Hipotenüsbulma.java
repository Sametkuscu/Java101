import java.util.Scanner;
public class Hipotenushesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarın uzunluğu: ");
        int sayı1 = input.nextInt();
        System.out.println("İkinci kenarın uzunluğu: ");
        int sayı2 = input.nextInt();
        double son = Math.sqrt((sayı1*sayı1) + (sayı2*sayı2));
        
        System.out.println("Hipotenüs:" + son);
    }
}
