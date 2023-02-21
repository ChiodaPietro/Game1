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
        foods=new ArrayList<>();
        coins=new ArrayList<>();
        weapons=new ArrayList<>();

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
    public Coin addCoin(String name){
        for (int i = 0; i < Coin.coins.length; i++) {
            if(Coin.coins[i].getId().contains(name)){
                coins.add(Coin.coins[i]);
                return Coin.coins[i];
            }
        }
        return null;
    }
    public Weapon addWeapon(String name){
        for (int i = 0; i < Weapon.weapons.length; i++) {
            if(Weapon.weapons[i].getId().contains(name)){
                weapons.add(Weapon.weapons[i]);
                return Weapon.weapons[i];
            }
        }
        return null;
    }
    public Food addFood(String name){
        for (int i = 0; i < Food.foods.length; i++) {
            if(Food.foods[i].getId().contains(name)){
                foods.add(Food.foods[i]);
                return Food.foods[i];
            }
        }
        return null;
    }
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < foods.size(); i++) {
            string.append(foods.get(i).toString()+"\n");
        }
        for (int i = 0; i < coins.size(); i++) {
            string.append(coins.get(i).toString()+"\n");
        }
        for (int i = 0; i < weapons.size(); i++) {
            string.append(weapons.get(i).toString()+"\n");
        }
        return string.toString();
    }
    public String toString(String Class){
        StringBuilder string = new StringBuilder();
        switch (Class.toLowerCase()){
            case "weapon":
                for (int i = 0; i < weapons.size(); i++) {
                    string.append(weapons.get(i).toString()+"\n");
                    return string.toString();
                }
                break;
            case "food":
                for (int i = 0; i < foods.size(); i++) {
                    string.append(foods.get(i).toString()+"\n");
                    return string.toString();
                }
                break;
            case "coin":
                for (int i = 0; i < coins.size(); i++) {
                    string.append(coins.get(i).toString()+"\n");
                    return string.toString();
                }
                break;
            default:
                throw  new IllegalArgumentException();
        }
        return null;
    }

}
