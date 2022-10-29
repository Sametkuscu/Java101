import java.util.Scanner;
public class fibonacciricurvise {

    static int fib (int number){
        if (number==1 || number==2){

            return 1;
        }
        return fib (number-1)+fib(number-2);
    }

    public static void main(String[] args) {

        int lp=0,lp1=1;
        while (!(lp==lp1)){
        Scanner imput = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi= imput.nextInt();
        System.out.println("Fibonacci serisi: "+fib(sayi));
            System.out.println("----------------------------");
    }




    }







}
