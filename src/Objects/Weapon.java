package Objects;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Weapon extends Obj{
    private String name;
    private String description;
   public Weapon( double weight, String name, String description){
        super(name+"__"+description, weight);
        this.name=name;
        this.description=description;

    }

}
