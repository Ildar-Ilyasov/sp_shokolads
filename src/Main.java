public class Main {
    public static void main(String[] args) {
        int money = 15;
        int wrap = 3;
        int price = 1;


        int BuyChokolate = money / price;
        int chokolates = BuyChokolate;

        while(chokolates >= wrap){
            int dopChokolates = chokolates / wrap;
            BuyChokolate += dopChokolates;
            chokolates =dopChokolates + (chokolates % wrap);
        }
        System.out.println("Шоколадок: " + BuyChokolate);
    }
}