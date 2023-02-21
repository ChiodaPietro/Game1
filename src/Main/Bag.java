package Main;


import Objects.Coin;
import Objects.Food;
import Objects.Weapon;

import java.util.ArrayList;

public class Bag  {
    //max weight of a bag, the bag can't contain more
    private double max_weight;
    //all the 3 type of list to contain the 3 type of objects
    private ArrayList<Food> foods;
    private ArrayList<Coin> coins;
    private ArrayList<Weapon> weapons;
    // is the bag full? this attribute tells us
    private boolean full_bag;
    public Bag(int category){
        switch (category){
            case 1:
                max_weight=1000;
                break;
            case 2:
                max_weight=1200;
                 break;
            case 3:
                max_weight=1500;
                break;
        }
        foods=new ArrayList<>();
        coins=new ArrayList<>();
        weapons=new ArrayList<>();
        full_bag=false;
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
    //add stuff, return an object so the class objectstation will remove that object from its list
    public Coin addCoin(String name){
        if(full_bag){
            return null;
        }
        for (int i = 0; i < Coin.coins.length; i++) {
            if(Coin.coins[i].getId().contains(name)){
                if(!check_weight()){
                    System.out.println("the bag is full");
                }else {
                    coins.add(Coin.coins[i]);
                    return null;
                }
                return Coin.coins[i];
            }
        }
        return null;
    }
    public Weapon addWeapon(String name){
        if(full_bag){
            return null;
        }
        for (int i = 0; i < Weapon.weapons.length; i++) {
            if(Weapon.weapons[i].getId().contains(name)){
                if(!check_weight()){
                    System.out.println("the bag is full");
                }else{
                    weapons.add(Weapon.weapons[i]);
                    return null;
                }
                return Weapon.weapons[i];
            }
        }
        return null;
    }
    public Food addFood(){
        if(full_bag){
            return null;
        }
        if(!check_weight()){
            System.out.println("the bag is full");
        }else {
            foods.add(Food.foods[0]);
            return null;
        }
        return Food.foods[0];

    }
    // the three remove methods, to find an object through the name compared to the ids, and remove it
    public boolean removeCoin(String name){
        for (int i = 0; i < Weapon.weapons.length; i++) {
            if(Weapon.weapons[i].getId().contains(name)){
                weapons.remove(Weapon.weapons[i]);
                return true;
            }
        }
        return false;
    }
    public boolean removeWeapon(String name){
        for (int i = 0; i < Weapon.weapons.length; i++) {
            if(Weapon.weapons[i].getId().contains(name)){
                weapons.remove(Weapon.weapons[i]);
                return true;
            }
        }
        return false;
    }
    public boolean removeFood(){
        foods.remove(Food.foods[0]);
        return true;
    }
    //set the attribute "full_bag", and when the remove method for the objects inside the bazar receives a null obj
    // So it won't remove anything
    private boolean check_weight(){
        int tot=0;
        for (int i = 0; i < foods.size(); i++) {
            tot+=foods.get(i).getWeight();
        }
        for (int i = 0; i < weapons.size(); i++) {
            tot+=weapons.get(i).getWeight();
        }
        for (int i = 0; i < coins.size(); i++) {
            tot+=coins.get(i).getWeight();
        }
        if(tot>=max_weight){
            full_bag=true;
            return false;
        }
        full_bag=false;
        return true;
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
                }
                break;
            case "food":
                for (int i = 0; i < foods.size(); i++) {
                    string.append(foods.get(i).toString()+"\n");
                }
                break;
            case "coin":
                for (int i = 0; i < coins.size(); i++) {
                    string.append(coins.get(i).toString()+"\n");
                }
                break;
            default:
                throw  new IllegalArgumentException();
        }
        return string.toString();
    }

}
