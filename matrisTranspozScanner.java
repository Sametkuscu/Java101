import java.util.Scanner;

public class matrisTranspozScanner {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Satır sayısı Sütun sayısından küçük olmalı!!!");
            System.out.print("Satır sayısı: ");
            int ilksayi = girdi.nextInt();
            System.out.print("Sütun sayısı: ");
            int ikincisayi = girdi.nextInt();


        int [][] list = new int[ilksayi][ikincisayi];

        for(int p=0; p<ilksayi;p++){
            for (int j =0; j<ikincisayi; j++) {
                System.out.print((p+1)+". satır "+(j+1)+". sayıyı girin: ");
                list[p][j]= girdi.nextInt();
            }
        }
        for (int i = 0; i< list.length/2;i++){
            System.out.println("");
        }


        System.out.println("Matris : ");

        for (int i = 0; i< list.length/2;i++){
            for (int j =0; j<= list.length;j++){
                System.out.print(list[i][j]+"  ");
            }
        }
        System.out.println();
        for (int i = list.length/2; i< list.length;i++){
            for (int j =0; j<= list.length;j++){
                System.out.print(list[i][j]+"  ");
            }
        }

        System.out.println();
        System.out.println("=========================");
        System.out.println("Transpoz : ");
        for (int i = 0; i<= list.length;i++){
            for (int j =0; j< list.length;j++) {
                System.out.print(list[j][i]+"    ");

            }
            System.out.println();
        }
    }
}
