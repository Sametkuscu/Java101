import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class enkucukenbuyuk {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int[] list = {1, 9, 63, 8, 66, 565, 65, 23, 6, 3};
        System.out.println(Arrays.toString(list));

        System.out.print("Bir sayı girin: ");
        int sayi = girdi.nextInt();
        
        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length-1];

        for (int i : list) {
            if (i < max && i>sayi) {
                max = i;
            }
            if (i > min && i<sayi) {
                min = i;
            }
        }
        System.out.println("En küçük sayı: "+min);
        System.out.println("En büyük sayı: "+max);
    }
}




