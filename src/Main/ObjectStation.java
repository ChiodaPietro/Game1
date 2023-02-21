package Main;

import Objects.Coin;
import Objects.Food;

import Objects.Obj;
import Objects.Weapon;

import java.util.ArrayList;
import java.util.Collections;

public class ObjectStation {
    private ArrayList<Food> foods;
    private ArrayList<Coin> coins;
    private ArrayList<Weapon> weapons;
    private double tot_weight;

    public ObjectStation() {
        tot_weight = 100000;
        foods = new ArrayList<Food>();
        coins = new ArrayList<Coin>();
        weapons = new ArrayList<Weapon>();
        fillStation();
    }

    private boolean fillStation() {
        for (int i = 0; i < 10; i++) {
            foods.add(Food.foods[(int) (Math.random() * Food.foods.length)]);
        }
        for (int i = 0; i < 10; i++) {
            weapons.add(Weapon.weapons[(int) (Math.random() * Weapon.weapons.length)]);
        }
        for (int i = 0; i < 10; i++) {
            coins.add(Coin.coins[(int) (Math.random() * Coin.coins.length)]);
        }
        return true;
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

    public double getTot_weight() {
        return tot_weight;
    }
    public boolean remove(String id){
        for (int i = 0; i <coins.size() ; i++) {
            if(coins.get(i).getId().contains(id)){
                coins.remove(i);
                return true;
            }
        }
        for (int i = 0; i < weapons.size(); i++) {
            if(weapons.get(i).getId().contains(id)){
                weapons.remove(i);
                return true;
            }
        }
        for (int i = 0; i < foods.size(); i++) {
            if(foods.get(i).getId().contains(id)){
                foods.remove(i);
                return true;
            }
        }
        return false;
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
}
