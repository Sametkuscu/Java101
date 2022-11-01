public class harmoniksayidizi {
    public static void main(String[] args) {

        double [] list = {1,2,3,4,5,6,7,8,9};

        double toplam=0;
        for (int i = 0; i<list.length; i++){

        toplam=toplam+(1/list[i]);
            System.out.println(toplam);

        }
    }
}
