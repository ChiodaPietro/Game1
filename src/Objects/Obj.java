package Objects;

import java.util.ArrayList;

public class Obj  {
    protected String id;
    private double weight;
    public Obj(String id, double weight){
        this.id= id;
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return "id: "+id+", weight: "+weight;
    }
}