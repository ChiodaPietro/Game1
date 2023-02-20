package Main;


import Objects.Coin;
import Objects.Food;
import Objects.Weapon;

import java.util.ArrayList;

public class Bag  {
    private double max_weight;
    private ArrayList<Food> foods;
    private ArrayList<Coin> coins;
    private ArrayList<Weapon> weapons;
    public Bag(int category){
        switch (category){
            case 1:
                max_weight=10000;
                break;
            case 2:
                max_weight=12000;
                 break;
            case 3:
                max_weight=15000;
                break;
        }

    }

    public double getMax_weight() {
        return max_weight;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

}
