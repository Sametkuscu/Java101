import java.util.Scanner;
public class ebobekokwhile {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        int n1=2, n2=1;
        while (n1>=n2) {
            System.out.print("1. Sayı: ");
            n1 = girdi.nextInt();
            System.out.print("2. Sayı: ");
            n2 = girdi.nextInt();
            if(n1>=n2){
                System.out.println("1. Sayı daha küçük olmak zorunda! Tekrar girin.");
                System.out.println("-----------------------------------------------");
            }
        }
        int ebob=1,ekok=1,i=1;

        while (i<=n1){
            if ((n1%i==0)&&(n2%i==0)){

                ebob=i;}

                i++;
        }
            System.out.println("EBOB: "+ebob);
        int k =1;
        while (k<=(n1*n2)){
            if ((k%n1==0)&&(k%n2==0)){
                ekok=k;
                break;
            }k++;
        }
        System.out.println("EKOK: "+ekok);
    }
}


