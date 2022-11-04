import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int tercih=0;
        while (tercih!=2){
        int a;
        int b;
        a=0;
        b=0;

        while (a<2) {
            System.out.println("----Sayı arttıkça zorluk yükselir!----\n" +
                    "----En küçük 2 girmelisiniz!----");
            System.out.print("Zorluk derecesi girin: ");

            a = girdi.nextInt();
            b = a;
            System.out.println();

        }
        mayin deneme = new mayin(a,b);
        deneme.str33();
        deneme.array();
        deneme.mayintarlasi();
            System.out.println();
            while (tercih!=1&&tercih!=2){
            System.out.println();
        System.out.println("1- Yeniden başlamak için \n" +
                "2- Çıkış");
        tercih= girdi.nextInt();
        if(tercih!=1&&tercih!=2){
            System.out.println("Yanlış seçim yaptınız tekrar deneyin!");
        }
            }

        }
    }
}
