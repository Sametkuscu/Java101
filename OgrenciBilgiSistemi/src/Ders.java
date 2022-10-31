public class Ders {

    String isim;
    String Ogretmen;
    String prefix;
    int code;

    Ders(String isim, String Ogretmen, String prefix,int code) {

        this.isim = isim;
        this.Ogretmen = Ogretmen;
        this.prefix = prefix;

        this.code = code;

    }
    void dersyazdir (){
        System.out.println("Ders Kodu: "+code);
        System.out.println("=============================");
    }
}
