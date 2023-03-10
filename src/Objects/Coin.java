package Objects;

public class Coin extends Obj{
    private String name;
    private String description;
    //base type of objects
    public static  final Coin[] coins= new Coin[]{new Coin(10, "gold_coin", "value_10"), new Coin(5, "silver_coin", "value_5")};
    public Coin( double weight, String name, String description){
        super(name+"__"+description, weight);
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString(){
        return super.toString()+", name: "+name+", description: "+description;
    }

}
