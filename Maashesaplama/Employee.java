public class Employee {
String ad;
int maas;
int calismasaati;
int baslangic;
double taxx;
double bonuss;
Double yilartisi;


Employee (String ad, int maas,int calismasaati, int baslangic){
    this.ad=ad;
    this.maas=maas;
    this.calismasaati=calismasaati;
    this.baslangic=baslangic;

}

public void tax(){

    double taxx=0;
    this.taxx=taxx;
    if (maas>1000){
        this.taxx= this.taxx+((maas*3)/100);
        System.out.println("Vergi: -"+this.taxx);
    }
    else {
        this.taxx=0;
        System.out.println("Vergi: -"+this.taxx);
    }
}

public void bonus (){
    double bonuss=0.0;
    this.bonuss=bonuss;
    if(calismasaati>=40){
        for(int i=1; i<=(calismasaati-40);i++){
            this.bonuss=this.bonuss+30;
        }
        System.out.println("Bonus: "+this.bonuss);
    }

}

public void yil (){
    double yilartisi=0.0;
    this.yilartisi=yilartisi;
    if(baslangic<=2021){
            if(baslangic<=2021-19){
            this.yilartisi=this.yilartisi+((maas*15)/100);
            System.out.println("Yıl artışı: "+this.yilartisi);
            }
            else if (baslangic<=(2011)&&baslangic>=2021-19){
                this.yilartisi=this.yilartisi+((maas*10)/100);
            System.out.println("Yıl artışı: "+this.yilartisi);
            }
            else if (baslangic<=(2021)&&baslangic>=2011){
                this.yilartisi=this.yilartisi+((maas*5)/100);
                System.out.println("Yıl artışı: "+this.yilartisi);
            }

    }

}







public void yazdir (){
    if(maas>=1000){
    System.out.println("İsim: "+this.ad);
    System.out.println("Başlangıç yılı: "+this.baslangic);
    System.out.println("Haftalık çalışşma saati: "+this.calismasaati);
    System.out.println("---------------------------------------------");
    System.out.println("Maaş: "+maas);
    yil();
    bonus();
    
    tax();
    double vergibonusmaas=maas+this.bonuss-this.taxx;
    double toplammaas=vergibonusmaas+yilartisi;
    System.out.println("Toplam maaş: "+toplammaas);
    System.out.println("============================================");
    }else{System.out.println("Maaş asgari ücretin (1000) altında olamaz.");}
    }
}






