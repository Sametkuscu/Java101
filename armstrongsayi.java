import java.util.Scanner;
public class armstrongsayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int sayi = girdi.nextInt();
        int gecicisayi = sayi;
        int basamak=0;
        int kalan,uslusayi=1;
        int sonuc=0;

        while (gecicisayi!=0){
            basamak++;
            gecicisayi = gecicisayi/10;}
        
        uslusayi = sayi;
        while (uslusayi>=1){
            kalan= uslusayi % 10;
            uslusayi = uslusayi/10;

        int toplam=kalan;
            for(int i=1; i<basamak;i++){
                toplam = (kalan*toplam);}

                sonuc=toplam+sonuc;}
        
        if(sonuc==sayi){
            System.out.println(+sayi+" Armstrong sayıdır.");}
        else{System.out.println(+sayi+" Armstrong sayı değildir..");}
    }
}
