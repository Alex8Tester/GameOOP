package game.Intellect;
import game.BaseUnit;
import java.util.List;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;

    public Monk(String name, int x, int y) {
        super(name, 90, 90, 8, 8, 7, 1, 1, 0, 70, x, y);
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }

    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}