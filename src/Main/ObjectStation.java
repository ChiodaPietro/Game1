package Main;

import Objects.Coin;
import Objects.Food;

import Objects.Obj;
import Objects.Weapon;

import java.util.ArrayList;
import java.util.Collections;

public class ObjectStation {
    //three categories of objs, the max weight of the bazaar
    private ArrayList<Food> foods;
    private ArrayList<Coin> coins;
    private ArrayList<Weapon> weapons;
    private double tot_weight;

    public ObjectStation() {
        tot_weight = 10000;
        foods = new ArrayList<Food>();
        coins = new ArrayList<Coin>();
        weapons = new ArrayList<Weapon>();
        // fill the station with random objects from the final lists inside the other objects classes
        fillStation();
    }

    private boolean fillStation() {
        int tot=0;
        int i=0;
        while(tot<tot_weight) {

                foods.add(Food.foods[(int) (Math.random() * Food.foods.length)]);
                tot += foods.get(i).getWeight();

                weapons.add(Weapon.weapons[(int) (Math.random() * Weapon.weapons.length)]);
                tot += weapons.get(i).getWeight();

                coins.add(Coin.coins[(int) (Math.random() * Coin.coins.length)]);
                tot += coins.get(i).getWeight();
            i++;
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
    //find an object and remove it through its id
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
    //return all
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
    //return a type
    public String toString(String Class){
        StringBuilder string = new StringBuilder();
        switch (Class.toLowerCase()){
            case "weapon", "weapons", "weap":
                for (int i = 0; i < weapons.size(); i++) {
                    string.append(weapons.get(i).toString()+"\n");
                    return string.toString();
                }
                break;
            case "food", "foo", "fo", "good":
                for (int i = 0; i < foods.size(); i++) {
                    string.append(foods.get(i).toString()+"\n");
                    return string.toString();
                }
                break;
            case "coin", "coi", "co":
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
