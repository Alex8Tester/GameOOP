package game.Strength;
import game.BaseUnit;
import java.util.List;

public class Piciner extends Strength {
    protected int armor;
    public Piciner(String name, int x, int y) {
        super(name, 140, 140, 30, 3, 18, 3, 1, 0, x, y);
        this.armor = armor;
    }
    public String getInfo(){
        return "Пикинер";
    }
}
