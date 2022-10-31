public class Karakter {
    String ad;
    int can;
    int hasarr;
    int agirlik;
    double sans;


    Karakter (String ad,int can,int hasarr,int agirlik,int sans){
        this.ad=ad;
        this.can=can;
        this.hasarr=hasarr;
        this.agirlik=agirlik;
        this.sans=sans;
    }

    public int hasar (Karakter dusman){

        System.out.println(this.ad+"==>"+ dusman.ad+" "+this.hasarr+" hasar vurdu.");

        if (sans()){
            System.out.println(dusman.ad+" gelen hasarı savuşturdu.");
            return dusman.can;
        }
        if (dusman.can-this.hasarr<0){
            return 0;
        }

        return dusman.can-this.hasarr;
    }

    public boolean sans (){
        double rastgelesayi = Math.random()*100;
        return rastgelesayi<=this.sans;
    }

}