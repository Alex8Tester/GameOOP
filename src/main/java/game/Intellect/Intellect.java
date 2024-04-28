package game.Intellect;
import game.BaseUnit;
import java.util.List;

public class Intellect extends BaseUnit {
    protected int intellect;

    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.intellect = intellect;
    }
    @Override
    public void GetDamage(int damage) {
        if (this.HP - damage > 0) {
            this.HP -= damage;
        }
    }
    @Override
    public void Attack(BaseUnit target) {

    }

    @Override
    public void Healing(BaseUnit target) {

    }
    @Override
    public void step(List<BaseUnit> team1, List<BaseUnit> team2) {

    }
}
