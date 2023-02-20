package Main;

import Objects.Coin;
import Objects.Obj;

public class Main {
    public static void main(String[] args) {
        ObjectStation station= new ObjectStation(10, 10, 10);
        System.out.println(station.getFoods()[1].getWeight());
        Bag b= new Bag(1);
        b.getCoins().add(station.getCoins()[1]);

    }
}
