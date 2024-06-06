package game.Strength;
import game.BaseUnit;
import game.Position;
import java.util.ArrayList;


public class Spearman extends Strength {
    protected int armor;
    public Spearman(String name, int x, int y) {
        super(name, 60, 80, 25, 2, 10, 3, 1, 0, 5, x, y);
        this.armor = 10;
    }
    public String getInfo(){
        return "Копейщик";
    }
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (HP <= 0) return;
        if(findNearestTarget(enemy) == null){
            return;
        }
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
            flag = true;
            if (unit.position.equals(newposition) && unit.getHP() > 0) {
                flag = true;
                break;
            }
            if (flag) {
                this.position = newposition;
            }
        }
    }
}
