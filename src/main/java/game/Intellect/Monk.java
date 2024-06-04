package game.Intellect;
import game.BaseUnit;
import game.MyInterface;
import java.util.ArrayList;
import java.util.*;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;
    boolean flag;

    public Monk(String name, int x, int y) {
        super(name, 90, 90, 8, 8, 7, 1, 1, 0, 70, x, y);
        this.maxMana = this.mana = 10;
        flag = false;
    }
    public String getInfo() {
        return "Монах";
    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {

    }
}