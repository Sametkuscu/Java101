public class Oyun {
    Karakter k1;
    Karakter k2;
    int endusukagirlik;
    int enbuyukagirlik;
    double sans2=35;
    int i=1;

    Oyun (Karakter k1,Karakter k2,int endusukagirlik, int enbuyukagirlik){

        this.k1=k1;
        this.k2=k2;
        this.endusukagirlik=endusukagirlik;
        this.enbuyukagirlik=enbuyukagirlik;
    }


    public void run(){

        if(((endusukagirlik<= k1.agirlik&&enbuyukagirlik>= k1.agirlik)&&(endusukagirlik<= k2.agirlik)&&(enbuyukagirlik>= k2.agirlik))){
        while (k1.can>0 && k2.can>0){



            System.out.println("======== "+i+". Round ========");
            if(sans2()){
            k2.can= k1.hasar(k2);

            if(k2.can<=0) {
                break;
                }
            }
            else {
                System.out.println(k2.ad+" gelen hasarı savuşturdu.");
            }
            if(sans2()) {
                k1.can = k2.hasar(k1);
            }else {
                System.out.println(k1.ad+" gelen hasarı savuşturdu.");
            }

            yazdir();
            i++;
            }
            if(k2.can<=0) {
                yazdir();
                i++;
            }
    }else {
            System.out.println("Ağırlıklar uyuşmuyor.");
        }
            if(k1.can==0){
                System.out.println(k2.ad+" Kazandı.");
            }
            if (k2.can==0){
                System.out.println(k1.ad+" Kazandı.");


        }
    }


    public void yazdir (){
        System.out.println(k1.ad+" can: "+k1.can);
        System.out.println(k2.ad+" can: "+k2.can);
        System.out.println();
    }
    public void sans(){

    }
    public boolean sans2 (){
        double rastgelesayi2 = Math.random()*100;
        return rastgelesayi2<=this.sans2;
        }

    public void kazandi(){
        if(k1.can==0){
            System.out.println(k2.ad+" Kazandı.");
        }
        if (k2.can==0){
            System.out.println(k1.ad+" Kazandı.");
        }
    }


}