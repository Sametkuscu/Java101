import java.util.Scanner;

public class palindromHarf {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);


        while (true){
        System.out.print("Bir kelime girin: ");
        String kelime = girdi.nextLine();

        int i=0;
        int j=kelime.length()-1;

        if (kelime.charAt(i)==kelime.charAt(j)){
            System.out.println(kelime+" kelimesi palindromdur.");
        }
        else {
            System.out.println(kelime+" kelimesi palindrom değildir.");
        }
            System.out.println("===============================================");
    }
    }
}
