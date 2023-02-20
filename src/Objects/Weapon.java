package Objects;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Weapon extends Obj{
    private String name;
    private String description;
    public static final Weapon[] weapons=new Weapon[]{new Weapon(200,"stone_sword","damage_4" ), new Weapon(300, "iron_sword", "damage_7")};;
   public Weapon( double weight, String name, String description){
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


}
