package game.Agility;
import game.BaseUnit;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agility extends BaseUnit {
    protected int agility;

    public Agility(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative, int level, int experience,
                   int agility, int x, int y) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience, x, y);
        this.agility = agility;
    }
    @Override
    public void getDamage(double damage) {
        if (this.HP - damage > 0) {
            this.HP -= damage;
        }
    }

    @Override
    public void healing(BaseUnit target) {

    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
    }
}