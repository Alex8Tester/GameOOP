package game.Agility;
import game.BaseUnit;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agility extends BaseUnit {
    protected int agility;

    public Agility(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative, int level, int experience,
                   int agility,int speed, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, speed, x, y);
        this.agility = agility;
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