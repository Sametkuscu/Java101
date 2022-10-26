import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n, r;
        int ntoplam = 1, rtoplam = 1,nrtoplam=1,total=0;

        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)
        do {
        System.out.print("n: ");
        n = girdi.nextInt();
        System.out.print("r: ");
        r = girdi.nextInt();
        
            if(n<r){System.out.println("Lütfen 'n' sayısnı 'r' sayısından küçük girin!");}}
        while (n<r);{}

        for (int i = 1; i <= n; i++) {
            ntoplam = ntoplam*i;}

        for (int i = 1; i <= r; i++) {
            rtoplam = rtoplam*i;}

        for (int i = 1; (i <= (n-r)); i++) {
            nrtoplam = nrtoplam*i;}

        total = (ntoplam/(rtoplam*nrtoplam));
        System.out.print("Sonuç: "+ total);
    }
}
