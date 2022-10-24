import java.util.Scanner;

public class KDVtutarihesaplama {
    public KDVtutarihesaplama() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün fiyatını girin: ");
        int kfiyat = input.nextInt();
        boolean bintlustu = kfiyat >=1000;
        boolean bintlalti = kfiyat <1000;
        double kdvfiyat = (bintlustu)? 0.08: 0.18;
        double sonfiyat = (kfiyat * kdvfiyat) + kfiyat;
        double sonfiyat2 = (kfiyat * kdvfiyat);
        System.out.print("KDV oranı: ");
        System.out.println(kdvfiyat);
        System.out.print("KDV: ");
        System.out.println(sonfiyat2);
        System.out.print("Kdv'li fiyat: ");
        System.out.println(sonfiyat);
    }
}
