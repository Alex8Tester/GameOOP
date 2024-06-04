package game.Intellect;
import game.BaseUnit;
import java.util.ArrayList;


public class Magician extends Intellect {
    protected int mana;
    protected int maxMana;
    public Magician(String name, int x, int y) {
        super(name, 80, 80, 10, 8, 6, 1, 1, 0, 60, x, y);
        this.maxMana = this.mana = mana;
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if ((getHP() <= 0) || (mana < 3)) {
            mana += 1;
        } else {
            hitEnemy(findNearestTarget(enemy));
            mana -= 3;
        }
    }
    public String getInfo(){
        return "Маг";
    }
}
