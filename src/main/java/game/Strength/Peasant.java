package game.Strength;
import game.BaseUnit;
import java.util.List;

public class Peasant extends Strength {

    public Peasant(String name, int x, int y) {
        super(name, 45, 45, 4, 2, 5, 1, 1, 0, x, y);
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}
