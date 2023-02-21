package Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectStation objectStation= new ObjectStation();
        BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("create your bag: ");
        System.out.println("size");
        Bag bag= new Bag(Integer.parseInt(rd.readLine()));
        while(true){
            System.out.println("open");
            switch (rd.readLine()){
                case "open":
                    boolean exit=false;
                    while(!exit){
                        System.out.println("add; remove; bookinside; look");
                        switch (rd.readLine()){
                            case "add":
                                System.out.println("coin; food; weapon");
                                switch (rd.readLine()){
                                    case "coin":
                                            System.out.println("silver or gold?");
                                            objectStation.getCoins().remove(bag.addCoin(rd.readLine()));
                                        break;
                                    case "food":
                                        objectStation.getFoods().remove(bag.addFood());
                                        break;
                                    case "weapon":
                                        System.out.println("stone or iron?");
                                        objectStation.getWeapons().remove(bag.addWeapon(rd.readLine()));
                                        break;
                                }
                                break;
                            case "remove":
                                switch (rd.readLine()){
                                    case "coin":
                                        System.out.println("silver or gold?");
                                        bag.removeCoin(rd.readLine());
                                        break;
                                    case "food":
                                        bag.removeFood();
                                        break;
                                    case "weapon":
                                        System.out.println("stone, silver?");
                                        bag.removeWeapon(rd.readLine());
                                        break;
                                }
                                break;
                            case "lookinside":
                                System.out.println(bag.toString());
                                break;
                            case "look":
                                System.out.println("coin; food; weapon ");
                                System.out.println(bag.toString(rd.readLine()));
                                break;
                            default:
                                exit=true;
                        }
                    }
            }
        }
    }
}
