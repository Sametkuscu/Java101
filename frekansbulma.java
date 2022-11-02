import java.util.Arrays;

public class frekansbulma {

    public static void main(String[] args) {

        int [] list = {10,20,10,20,30,40,10,10,5};
        int [] list2= new int[list.length];

            for ( int i = 0; i<list.length; i++){
                list2[i]=1;
            }


            for (int i =0; i <list.length; i++){
                for (int j = 0; j< list.length; j++){
                        if ((i !=j)&&(list[i])==(list[j])){
                            list2[i]++;
                        }
                }
            }

            for ( int i= 0; i < list.length; i++){
                for(int j =0; j< list.length; j++){
                    if ((i!=j)&&(list[i]==list[j])){
                        list[j]=0;
                    }
                }
            }

            for ( int i =0; i< list.length; i++){
                if(list2[i]>=1){
                    if(list[i]!=0){
                        System.out.println(list[i]+" sayısı: "+list2[i]+" kere tekarlandı.");
                    }
                }
            }
    }

}

