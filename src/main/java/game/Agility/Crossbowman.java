package game.Agility;
import game.BaseUnit;
import game.Strength.Peasant;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Crossbowman extends Agility {
    protected int bolt;
    protected int maxBolt;
    protected int accuracy;

    public Crossbowman(String name, int x, int y) {
        super(name, 45, 60, 25, 1, 7, 2, 1, 0, 20,5, x, y);
        this.maxBolt = this.bolt = 20;
        this.accuracy = 3;
    }
    @Override
    public String toString(){
        return super.toString() + ", \u27b6 : " + bolt;
    }

    public String getInfo() {
        return "Арбалетчик";
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHP() <= 0 || bolt == 0) return;
        hitEnemy(findNearestTarget(enemy));
        bolt--;
            if (bolt < maxBolt){
                for (BaseUnit unit : friend) {
                    if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                        ((Peasant) unit).flag = true;
                        bolt++;
                        return;
                }
            }
        }
    }
}