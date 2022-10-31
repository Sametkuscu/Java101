public class Main {
    public static void main(String[] args) {
        Karakter zt = new Karakter("Muhammed Ali",100,10,100,25);
        Karakter kt = new Karakter("Conor McGregor ",100,10,80,25);

        Oyun game= new Oyun(zt,kt,70,100);


        game.run();
    }
}