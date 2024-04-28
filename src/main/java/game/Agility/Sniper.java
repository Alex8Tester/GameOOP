package game.Agility;
import game.BaseUnit;
import java.util.List;

public class Sniper extends Agility {
    protected int accuracy;
    protected int ammo;
    public Sniper(String name, int x, int y) {
        super(name, 120, 120, 25, 1, 15, 2, 1, 0, 40, x, y);
        this.accuracy = accuracy;
        this.ammo = ammo;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {
        super.step(team1, team2);
    }
}
