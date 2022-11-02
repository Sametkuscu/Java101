import java.util.Arrays;
import java.util.Scanner;

public class matrisTranspoz {
    public static void main(String[] args) {

        int [][] list ={{1,2,3},
                        {4,5,6}
        };
        

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
