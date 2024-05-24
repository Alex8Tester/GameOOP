package game.Strength;
import game.BaseUnit;
import game.Position;

import java.util.ArrayList;


public class Piciner extends Strength {
    protected int armor;
    public Piciner(String name, int x, int y) {
        super(name, 140, 140, 30, 3, 18, 3, 1, 0, x, y);
    this.armor = 150;
    }
    public String getInfo(){
        return "Пикинер";
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
