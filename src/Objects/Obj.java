package Objects;

public class Obj {
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

}
