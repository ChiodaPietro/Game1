package Objects;

public class Coin extends Obj{
    private String name;
    private String description;
    public Coin( double weight, String name, String description){
        super(name+"__"+description, weight);
        this.name=name;
        this.description=description;
    }

}
