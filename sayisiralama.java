import java.util.Scanner;
public class sayisiralama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double a,b,c;
        System.out.print("1. Sayıyı girin: ");
        a = girdi.nextDouble();

        System.out.print("2. Sayıyı girin: ");
        b = girdi.nextDouble();

        System.out.print("3. Sayıyı girin: ");
        c = girdi.nextDouble();

        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println("a>b>c");}
            else {
                System.out.println("a>c>b");}}
        if ((b>a) && (b>c)){
            if (a>c){
            System.out.println("b>a>c");}
            else {
            System.out.println("b>c>b");}}
        if ((c>a) && (c>b)){
            if (a>b){
                System.out.println("c>a>b");}
            else {
                System.out.println("c>b>a");}}}

}
