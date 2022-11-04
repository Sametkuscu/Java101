import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mayin {
Scanner girdi = new Scanner(System.in);
    int a;
    int b;
    int satir;
    int sutun;
    String str [][];
    String str2[][];
    String str3[][];
    String str4[][];
    String ikincigiris;
    int sayac=0;
    String sayac2;


    mayin (int a,int b){
        this.a=a;
        this.b=b;
    }

    public int array () {

        String[][] str = new String[this.b][this.a];
        String[][] str2 = new String[this.b][this.a];
        this.str=str;

        for (int i = 0; i<str.length; i++){
            for(int j = 0 ; j<str.length; j++){
                str[i][j]="-";
            }
        }
        this.ikincigiris=ikincigiris;
        String ikincigiris=str2[this.satir][this.sutun];
        //System.out.println();
        return 2;
    }

    public void str33() {
        String[][] str3 = new String[this.b][this.a];
        this.str3 = str3;
        for (int i = 0; i < str3.length; i++) {
            for (int j = 0; j < str3.length; j++) {
                str3[i][j] = "-";

                System.out.print(str3[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }
        public void str35(){

            for (int i = 0; i<str3.length; i++){
                for(int j = 0 ; j<str3.length; j++){

                    if(str3[i][j].equals("-")) {
                        str3[i][j] = "-";
                        System.out.print(str3[i][j] + "    ");
                    }
                    else{
                        System.out.print(str3[i][j]+ "    ");
                    }
                }
                System.out.println();
                System.out.println();
            }
            this.sayac2=sayac2;
            String sayac2=String.valueOf(sayac);
        }
    public int dongu(){

        this.str=str;

        for (int i = 0; i<str.length; i++){
            for(int j = 0 ; j<str.length; j++){

                if(str[i][j].equals("-")) {
                    str[i][j] = "-";
                }
                else{}
            }
            sayac=0;
        }
        return 2;
    }




    public void mayintarlasi () {

        String[][] str2 = new String[this.b][this.a];
        this.str=str;
        this.sutun=sutun;

            int toplammayin = ((str.length * str.length) / 4);
            int terstoplammayin = str.length * str.length - toplammayin;
            int bos = 0;
            for (int z = 1; z <= terstoplammayin; z++) {
                bos = bos + z;
            }

        while (toplammayin!=0){
        for (int i = 0; i<str.length; i++){
            for(int j = 0 ; j<str.length; j++){

                int randomsayi=(int) (Math.random()*(str.length*str.length));
                if(randomsayi<=(str.length*str.length)/4){
                    if(toplammayin>0){
                    str2[i][j]="*";
                    toplammayin--;
                }
                    else {str2[i][j]="-";
                    }
                }
                else {
                    str2[i][j]="-";
                }
                //System.out.print(str2[i][j]+"    ");

            }
            //System.out.println();
            //System.out.println();
        }
        }

        int yanlis=0;
        while (yanlis<=0){
            System.out.println("===================================================");
        System.out.print("Bir satır girin: ");
        this.satir=girdi.nextInt();
        satir--;
        System.out.print("Bir sütun girin: ");
        this.sutun= girdi.nextInt();
        sutun--;
            System.out.println();
        if((satir<str.length&&satir>=0)&&(sutun< str.length&&sutun>=0)){
        String ilkgiris=str[this.satir][this.sutun];
        this.ikincigiris=ikincigiris;
        String ikincigiris=str2[this.satir][this.sutun];

            this.sayac=sayac;

            if (((this.satir - 1)>=0)&&((this.sutun - 1)>=0)){
                if (str2[(this.satir - 1)][(this.sutun - 1)].equals("*")) {
                    sayac++;
                }}

            if (((this.satir - 1)>=0)&&((this.sutun)>=0)){
                if (str2[(this.satir - 1)][(this.sutun)].equals("*")) {
                    sayac++;
                }}
            if (((this.satir - 1)>=0)&&((this.sutun + 1)< str.length)){
                if (str2[(this.satir - 1)][(this.sutun + 1)].equals("*")) {
                    sayac++;
                }}
            if (((this.satir)>=0)&&((this.sutun - 1)>=0)){
                if (str2[(this.satir)][(this.sutun - 1)].equals("*")) {
                    sayac++;
                }}
            if (((this.satir)>=0)&&((this.sutun + 1)< str.length)){
                if (str2[(this.satir)][(this.sutun + 1)].equals("*")) {
                    sayac++;
                }}
            if (((this.satir + 1)< str.length)&&((this.sutun - 1)>=0)){
                if (str2[(this.satir + 1)][(this.sutun - 1)].equals("*")) {
                    sayac++;
                }}
            if (((this.satir + 1)< str.length)&&((this.sutun)>=0)){
                if (str2[(this.satir + 1)][(this.sutun)].equals("*")) {
                    sayac++;
                }}
            if (((this.satir + 1)<str.length)&&((this.sutun + 1)<str.length)){
                if (str2[(this.satir + 1)][(this.sutun + 1)].equals("*")) {
                    sayac++;
                }}

            this.sayac2=sayac2;
            String sayac2=String.valueOf(sayac);

        if(ilkgiris.equals("-")){
        if(ilkgiris.equals(ikincigiris)) {
            this.str[this.satir][this.sutun]="%";
            this.str3[this.satir][this.sutun]=sayac2;
            str35();
            dongu();
            for (int i =0; i< str.length; i++){
                for(int j =0; j< str.length;j++){
                    if(str[i][j].equals("%")){
                        bos--;
                            if (bos==0){
                                System.out.println();
                                for (int u = 0; u<str.length; u++){
                                    for(int h = 0 ; h<str.length; h++){
                                        System.out.print(str2[u][h]+"    ");
                                    }
                                    System.out.println();
                                    System.out.println();
                                }
                                System.out.println();
                                System.out.println("Oyunu kazandınız. Tebrikler.");
                                yanlis=1;
                            }
                        }

                }

            }
        }else {

            for (int i = 0; i<str.length; i++){
                for(int j = 0 ; j<str.length; j++){
                    System.out.print(str2[i][j]+"    ");
                }
                System.out.println();
                System.out.println();
            }
            System.out.println();
            System.out.println("Mayına bastınız. Oyunu kaybettiniz.");
            yanlis=1;
        }
        }else if (ilkgiris.equals("%")){
            System.out.println("Yanlış seçim yaptınız!");
            sayac=0;
        }
        }
        else {
            System.out.println("Yanlış seçim yaptınız! Tekrar deneyin. ");
        }
        }
    }
}
