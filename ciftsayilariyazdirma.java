import java.util.Scanner;
public class ciftsayilariyazdirma {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int k;
        System.out.print("Sayını girin: ");
        k = girdi.nextInt();

        for (int i=1; i<=k; i++){
            if (i % 2 == 0){
            System.out.println(i);
            }
        }
    }
}
