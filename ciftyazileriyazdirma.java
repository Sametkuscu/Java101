import java.util.Arrays;

public class ciftyazileriyazdirma {


    static boolean buldunmu (int [] liste,int value){
        for (int i : liste) {
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {


    int [] list = {5,6,64,2,3,46,668,9,56,6,5,3,2,64,56};
    int [] ciftyazdir = new int [list.length];
    int baslangicsayisi =0;


    for (int i = 0; i <list.length; i++){
        for (int j = 0; j<list.length; j++){
            if (i!=j && (list[i]==list[j])){

                if ((i!=j)&&!buldunmu(ciftyazdir,list[i])) {
                    ciftyazdir[baslangicsayisi++] = list[i];

                }
                break;
            }
        }
    }
        for ( int value : ciftyazdir){
            if ( value!=0){
                if (value%2==0){
                    System.out.print(value+" ");
                }
            }
        }
    }
}





