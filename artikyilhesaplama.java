import java.util.Scanner;
public class artikyilhesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Yılı giriniz: ");
        int yil = girdi.nextInt();
        int kalan = yil % 4;
        int kalan100 = yil % 100;
        int kalan400 = yil % 400;
        
        if (kalan==0){
            if (kalan100==0){
                    if (kalan100==kalan400){
                        System.out.println(yil+" Artık yıldır.");}
                    else{
                        System.out.println(yil+" Artık yıl değildir.");}
            }else {
                        System.out.println(yil+" Artık yıldır.");}
        }else {
            System.out.println(yil+" Artık yıl değildir.");
        }
    }
}
