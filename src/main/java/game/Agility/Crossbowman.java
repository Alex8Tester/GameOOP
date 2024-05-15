package game.Agility;
import game.BaseUnit;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Crossbowman extends Agility {
    protected int bolt;
    protected int accuracy;

    public Crossbowman(String name, int x, int y) {
        super(name, 120, 120, 25, 1, 15, 2, 1, 0, 40, x, y);
        this.bolt = 100;
        this.accuracy = 3;
    }

    public String getInfo() {
        return "Арбалетчик";
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHP() <= 0 || bolt == 0) return;
        hitEnemy(findNearestTarget(enemy));
        bolt--;
    }
}