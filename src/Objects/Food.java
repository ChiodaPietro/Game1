package Objects;

public class Food extends Obj{
    private String name;
    private String description;
    public Food( double weight, String name, String description){
        super(name+"__"+description, weight);
        this.name=name;
        this.description=description;
    }

}
