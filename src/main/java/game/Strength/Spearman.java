package game.Strength;
import game.BaseUnit;
import game.Position;

import java.util.ArrayList;
import java.util.List;

public class Spearman extends Strength {
    protected int armor;
    public Spearman(String name, int x, int y) {
        super(name, 160, 160, 25, 2, 20, 3, 1, 0, x, y);
        this.armor = armor;
    }
    public String getInfo(){
        return "Копейщик";
    }
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (HP <= 0) return;
        BaseUnit target = super.findNearestTarget(enemy);
        if (position.getDistance(target.position) < 2) {
            hitEnemy(findNearestTarget(enemy));
            return;
        }
        Position diff = position.getDiffPos(target.position);
        Position newposition = new Position(position.getX(), position.getY());
        if (Math.abs(diff.x) > Math.abs(diff.y))
            newposition.x += diff.x < 0 ? 1 : -1;
        else
            newposition.y += diff.y < 0 ? 1 : -1;

        for (BaseUnit unit : friend) {
            if (unit.position.equals(newposition) && unit.getHP() > 0) return;

        }
        this.position = newposition;
    }
}
