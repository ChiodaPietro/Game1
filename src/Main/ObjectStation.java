package Main;

import Objects.Coin;
import Objects.Food;

import Objects.Weapon;

import java.util.Random;

public class ObjectStation   {
    private Food[] foods;
    private Coin[] coins;
    private Weapon[] weapons;
    private double tot_weight;
    public ObjectStation(int food, int coin, int weapon){
        tot_weight=100000;
        foods=new Food[food];
        coins=new Coin[coin];
        weapons= new Weapon[weapon];
        fillStation();
    }
    private boolean fillStation(){
        for (int i = 0; i < foods.length; i++) {
            foods[i]=Food.foods[(int) (Math.random() * Food.foods.length)];
        }
        for (int i = 0; i < weapons.length; i++) {
            weapons[i]=Weapon.weapons[(int) (Math.random() * Weapon.weapons.length)];
        }
        for (int i = 0; i < coins.length; i++) {
            coins[i]=Coin.coins[(int) (Math.random() * Coin.coins.length)];
        }
        return true;
    }

    public Food[] getFoods() {
        return foods;
    }

    public Coin[] getCoins() {
        return coins;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public double getTot_weight() {
        return tot_weight;
    }
    public <T> void remove(int i, T[] t){
        for (int j = 0; j < t.length; j++) {

        }
    }
}
