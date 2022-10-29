import java.util.Scanner;
public class üslüsayirecursive {

    static int result=1;
    static int us (int a, int b){
        if (a==0){
            return 1;
        }

        result*=b;
        us(a-1,b);

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            int a, b;

            System.out.print("Tabandaki sayı: ");
            b = input.nextInt();
            System.out.print("Üsteki sayı: ");
            a = input.nextInt();

            System.out.println("Sonuç: " + us(a, b));
            System.out.println("---------------------------------");
        
    }
}
