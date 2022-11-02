import java.util.Arrays;
import java.util.Scanner;

public class sayisiralamaarray {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz: ");
        int listeboyutu = girdi.nextInt();
        System.out.println("Sayıları girin: ");

        int [] list = new int[listeboyutu];

        for (int i = 0; i<listeboyutu; i++){
            System.out.print((i+1)+". sayı: ");
            int sayi = girdi.nextInt();
            list [i] = sayi;
        }
        Arrays.sort(list);
        System.out.println("Sıralama: "+Arrays.toString(list));
    }
}
