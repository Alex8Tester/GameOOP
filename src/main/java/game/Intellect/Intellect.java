package game.Intellect;
import game.BaseUnit;
import java.util.List;
import java.util.ArrayList;

public class Intellect extends BaseUnit {
    protected int intellect;

    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.intellect = intellect;
    }
    @Override
    public void getDamage(double damage) {
        if (this.HP - damage > 0) {
            this.HP -= damage;
        }
    }
    @Override
    public void hitEnemy(BaseUnit target) {

    }
    @Override
    public void healing(BaseUnit target) {

    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {

    }
}
