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
        return "Монах";
    }
}