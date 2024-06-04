package game.Agility;
import game.BaseUnit;
import game.Strength.Peasant;
import java.util.ArrayList;

public class Sniper extends Agility {
    protected int accuracy;
    protected int ammo;
    protected int maxAmmo;
    public Sniper(String name, int x, int y) {
        super(name, 120, 120, 25, 1, 15, 2, 1, 0, 40, x, y);
        this.accuracy = 3;
        this.maxAmmo = this.ammo = 100;
    }

    @Override
    public String toString(){
        return super.toString() + ", \u27b6 : " + ammo;
    }
    public String getInfo() {
        return "Снайпер";
    }

    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if ((getHP() <= 0) || (ammo == 0)) return;
        hitEnemy(findNearestTarget(enemy));
        ammo--;
        if (ammo < maxAmmo) {
            for (BaseUnit unit : friend) {
                if (unit.getInfo().equals("Фермер") && !((Peasant)unit).flag) {
                    ((Peasant)unit).flag = true;
                    ammo++;
                    return;
                }
            }
        }
    }
}
