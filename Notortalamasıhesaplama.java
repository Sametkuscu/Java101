import java.util.Scanner;
public class Notortalamasıhesaplama {
    public static void main(String[] args) {
        System.out.println("Matematik ilk sınavdan kaç aldınız?");
        Scanner input = new Scanner(System.in);
        int matematiknotu = input.nextInt();
        System.out.println("Matematik ikinci sınavdan kaç aldınız?");
        Scanner input2 = new Scanner(System.in);
        int matematiknotu2 = input2.nextInt();
        System.out.println("Matematik üçüncü sınavdan kaç aldınız?");
        Scanner input3 = new Scanner(System.in);
        int matematiknotu3 = input3.nextInt();

        System.out.println("Fizik ilk sınavdan kaç aldınız?");
        Scanner input4 = new Scanner(System.in);
        int fiziknotu = input4.nextInt();
        System.out.println("Fizik ikinci sınavdan kaç aldınız?");
        Scanner input5 = new Scanner(System.in);
        int fiziknotu2 = input5.nextInt();
        System.out.println("Fizik üçüncü sınavdan kaç aldınız?");
        Scanner input6 = new Scanner(System.in);
        int fiziknotu3 = input6.nextInt();

        System.out.println("Kimya ilk sınavdan kaç aldınız?");
        Scanner input7 = new Scanner(System.in);
        int kimyanotu = input7.nextInt();
        System.out.println("Kimya ikinci sınavdan kaç aldınız?");
        Scanner input8 = new Scanner(System.in);
        int kimyanotu2 = input8.nextInt();
        System.out.println("Kimya üçüncü sınavdan kaç aldınız?");
        Scanner input9 = new Scanner(System.in);
        int kimyanotu3 = input9.nextInt();

        System.out.println("Türkçe ilk sınavdan kaç aldınız?");
        Scanner input10 = new Scanner(System.in);
        int turkcenotu = input10.nextInt();
        System.out.println("Türkçe ikinci sınavdan kaç aldınız?");
        Scanner input11 = new Scanner(System.in);
        int turkcenotu2 = input11.nextInt();
        System.out.println("Türkçe üçüncü sınavdan kaç aldınız?");
        Scanner input12 = new Scanner(System.in);
        int turkcenotu3 = input12.nextInt();

        System.out.println("Tarih ilk sınavdan kaç aldınız?");
        Scanner input13 = new Scanner(System.in);
        int tarihnotu = input13.nextInt();
        System.out.println("Tarih ikinci sınavdan kaç aldınız?");
        Scanner input14 = new Scanner(System.in);
        int tarihnotu2 = input14.nextInt();
        System.out.println("Tarih üçüncü sınavdan kaç aldınız?");
        Scanner input15 = new Scanner(System.in);
        int tarihnotu3 = input15.nextInt();

        System.out.println("Müzik ilk sınavdan kaç aldınız?");
        Scanner input16 = new Scanner(System.in);
        int muziknotu = input16.nextInt();
        System.out.println("Müzik ikinci sınavdan kaç aldınız?");
        Scanner input17 = new Scanner(System.in);
        int muziknotu2 = input17.nextInt();
        System.out.println("Müzik üçüncü sınavdan kaç aldınız?");
        Scanner input18 = new Scanner(System.in);
        int muziknotu3 = input18.nextInt();





        System.out.print("Matematik ortalamanız: ");
        int mattoplam = (matematiknotu + matematiknotu2 + matematiknotu3);
        double matort = (mattoplam/3);
        boolean gecti = matort >= 50;
        String durum = (gecti)? "Tebrikler sınıfı geçtiniz. :)" : "Malesef kaldınız. :(";
        System.out.println(matort);
        System.out.println(durum);

        System.out.print("Fizik ortalamanız: ");
        int fiziktoplam = (fiziknotu + fiziknotu2 + fiziknotu3);
        double fizikort = fiziktoplam/3;
        boolean gectifizik = fizikort >= 50;
        String durum2 = (gectifizik)? "Tebrikler sınıfı geçtiniz. :)" : "Malesef kaldınız. :(";
        System.out.println(fizikort);
        System.out.println(durum2);

        System.out.print("Kimya ortalamanız: ");
        int kimyatoplam = (kimyanotu + kimyanotu2 + kimyanotu3);
        double kimyaort = kimyatoplam/3;
        boolean gectikimya = kimyaort >= 50;
        String durum3 = (gectikimya)? "Tebrikler sınıfı geçtiniz. :)" : "Malesef kaldınız. :(";
        System.out.println(kimyaort);
        System.out.println(durum3);

        System.out.print("Türkçe ortalamanız: ");
        int turkcetoplam = (turkcenotu + turkcenotu2 + turkcenotu3);
        double turkceort = turkcetoplam/3;
        boolean gectiturkce = turkceort >= 50;
        String durum4 = (gectiturkce)? "Tebrikler sınıfı geçtiniz. :)" : "Malesef kaldınız. :(";
        System.out.println(turkceort);
        System.out.println(durum4);

        System.out.print("Tarih ortalamanız: ");
        int tarihtoplam = (tarihnotu + tarihnotu2 + tarihnotu3);
        double tarihort = tarihtoplam/3;
        boolean gectitarih = tarihort >= 50;
        String durum5 = (gectitarih)? "Tebrikler sınıfı geçtiniz. :)" : "Malesef kaldınız. :(";
        System.out.println(tarihort);
        System.out.println(durum5);

        System.out.print("Müzik ortalamanız: ");
        int muziktoplam = (muziknotu + muziknotu2 + muziknotu3);
        double muzikort = muziktoplam/3;
        boolean gectimuzik= muzikort >= 50;
        String durum6 = (gectimuzik)? "Tebrikler sınıfı geçtiniz. :)" : "Malesef kaldınız. :(";
        System.out.println(muzikort);
        System.out.println(durum6);

    }
}
