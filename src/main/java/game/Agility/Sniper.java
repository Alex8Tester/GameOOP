package game.Agility;
import game.BaseUnit;
import java.util.ArrayList;
import java.util.List;

public class Sniper extends Agility {
    protected int accuracy;
    protected int ammo;
    public Sniper(String name, int x, int y) {
        super(name, 120, 120, 25, 1, 15, 2, 1, 0, 40, x, y);
        this.accuracy = accuracy;
        this.ammo = ammo;
    }
    public String getInfo() {
        return "Снайпер";
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if ((HP <= 0) || (ammo == 0)) return;
        BaseUnit target = super.findNearestTarget(enemy);
        if (target == null) return;
        target.getDamage(this.attack);
        ammo--;
    }
}
