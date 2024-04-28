package game.Strength;
import game.BaseUnit;
import java.util.List;

public class Spearman extends Strength {
    protected int armor;
    public Spearman(String name, int x, int y) {
        super(name, 160, 160, 25, 2, 20, 3, 1, 0, x, y);
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
