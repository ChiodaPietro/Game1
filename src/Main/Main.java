package Main;

import Objects.Coin;
import Objects.Obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectStation objectStation= new ObjectStation();
        Bag b= new Bag(3);
        objectStation.getCoins().remove(b.addCoin("silver"));
        System.out.println(b.toString());
        System.out.println(objectStation.toString());
        BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
        while(true){
            switch (rd.readLine()){
                case "create":
                    System.out.println("name;size");
                    String [] ch= rd.readLine().split(";");
                    break;
                case "open":
                    while(true){
                        switch (rd.readLine()){
                            case "add":
                                switch (rd.readLine()){
                                    case "coin":
                                        System.out.println("silver or gold?");
                                        objectStation.getCoins().remove(b.addCoin(rd.readLine()));
                                        break;
                                    case "food":
                                        break;
                                    case "weapon":
                                        break;
                                }
                                break;
                            case "remove":
                                break;
                            case "lookinside":
                                break;
                            case "look":
                                break;
                        }
                    }
            }
        }
    }
}
