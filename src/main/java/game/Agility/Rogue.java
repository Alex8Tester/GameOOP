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
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}
