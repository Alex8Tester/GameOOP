package game.Intellect;
import game.BaseUnit;
import java.util.ArrayList;


public class Intellect extends BaseUnit {
    protected int intellect;

    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int speed, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, speed, x, y);
        this.intellect = intellect;
    }

    @Override
    public void healing(BaseUnit target) {

    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
    }
    @Override
    public boolean isDead() {
        return super.isDead();
    }
}
