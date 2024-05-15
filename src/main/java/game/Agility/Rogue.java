package game.Agility;
import game.BaseUnit;
import java.util.List;

public class Rogue extends Agility {
    protected int venom;
    protected double stealth;
    public Rogue(String name, int x, int y) {
        super(name, 100, 100, 30, 1, 15, 2, 1, 0, 40, x, y);
        this.venom = venom;
        this.stealth = stealth;
    }
    public String getInfo(){
        return "Разбойник";
    }
}
