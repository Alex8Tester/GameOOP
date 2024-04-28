package game.Strength;
import game.BaseUnit;
import java.util.List;

public class Piciner extends Strength {
    protected int armor;
    public Piciner(String name, int x, int y) {
        super(name, 140, 140, 30, 3, 18, 3, 1, 0, x, y);
        this.armor = armor;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}
