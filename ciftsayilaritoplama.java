import java.util.Scanner;
public class ciftsayilaritoplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi, total=0;

        do {
            System.out.print("Sayı girin: ");
            sayi= girdi.nextInt();
            if(sayi%2==0){
                if(sayi%4==0){
                total = total+sayi;}}
            else{
                System.out.println(total);
            }
        }
            while (sayi%2==0);
    }
}
