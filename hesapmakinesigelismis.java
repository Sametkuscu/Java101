import java.util.Scanner;
public class hesapmakinesigelismis {

     static int toplama(int a,int b){
         int result = a+b;
         System.out.println(result);

         return result;
    }

    static int cıkarma(int a,int b){
        int result = a-b;
        System.out.println(result);

        return result;
    }
    static int carpma(int a,int b){
        int result = a*b;
        System.out.println(result);

        return result;
    }
    static int bolme(int a,int b){
        int result = a/b;
        System.out.println(result);

        return result;
    }
    static void uslusayi(int a,int b){
            int toplam=1;
            int result=0;
        for (int i=1; i<=b; i++){

            toplam=toplam*a;

        }
        System.out.println(toplam);
    }

    static int modalma(int a){
        int result;
        result=a%10;
        System.out.println(result);

        return result;
    }
    static int alan(int a,int b){
        int result = a*b;
        System.out.println(result);

        return result;
    }

    static int cevre(int a,int b){
        int result = (2*(a+b));
        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
         Scanner girdi = new Scanner(System.in);

         while (true){
             System.out.println("----------------------------------");
    String menu = "1- Toplama\n"
            + "2- Çıkarma\n"
            + "3- Çarpma\n"
            + "4- Bölme\n"
            + "5- Üslü sayı alma\n"
            + "6- Mod alma\n"
            + "7- Dikdörtgen alan\n"
            + "8- Çevre hesabı\n"
            + "9- Çıkış";

            int  a, b = 0;
             int select;
                System.out.println(menu);
                System.out.print("Seçim: ");
                select=girdi.nextInt();
                if (select==9){
                    break;
                } else if (select==5) {
                    System.out.print("Üssü alıncak sayı: ");
                    a= girdi.nextInt();
                    System.out.print("Üssü: ");
                    b= girdi.nextInt();
                } else if (select==6) {
                    System.out.print("Modu alınacak sayı: ");
                    a= girdi.nextInt();
                    
                } else if (select==7) {
                    System.out.print("A kenarı: ");
                    a= girdi.nextInt();
                    System.out.print("B kenarı: ");
                    b= girdi.nextInt();
                    
                } else if (select==8) {
                    System.out.print("A kenarı: ");
                    a= girdi.nextInt();
                    System.out.print("B kenarı: ");
                    b= girdi.nextInt();
                }else {
                    System.out.print("İlk sayı: ");
                    a = girdi.nextInt();
                    System.out.print("İkinci sayı: ");
                    b = girdi.nextInt();
                }
             switch (select) {
                 case 1:
                     toplama(a,b);
                     break;

                 case 2:
                     cıkarma(a,b);
                     break;

                 case 3:
                     carpma(a,b);
                     break;

                 case 4:
                     bolme(a,b);
                     break;

                 case 5:
                     uslusayi(a,b);
                     break;

                 case 6:
                     modalma(a);
                     break;

                 case 7:
                     alan(a,b);
                     break;

                 case 8:
                     cevre(a,b);
                     break;

                 case 9:
                     break;

                 default:
                     System.out.println("Yanlış seçim yaptınız. Tekrar deneyin.");
             }
         }
         System.out.println("Güle güle. Tekrar görüşmek üzere. :)");
     }
}
