package Objects;

public class Food extends Obj{
    private String name;
    private String description;
    public static final Food[] foods= new Food[]{new Food(100, "steak", "energy_100")};
    public Food( double weight, String name, String description){
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
