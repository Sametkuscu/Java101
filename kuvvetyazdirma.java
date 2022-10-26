import java.util.Scanner;
public class kuvvetyazdirma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi,i;

        System.out.print("Bir sayı girin: ");
        sayi = girdi.nextInt();
        System.out.println("4'ün kuvvetleri");
        for (i=1;i<sayi;i*=4){
            System.out.println(i);}
        
        System.out.println("-------------------------");
        System.out.println("5'in kuvvetleri");
        for (i=1;i<sayi;i*=5){
            System.out.println(i);
        }
    }
}
