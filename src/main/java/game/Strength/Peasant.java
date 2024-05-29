package game.Strength;
import game.BaseUnit;
import java.util.ArrayList;

public class Peasant extends Strength {
    int ammo;
    boolean flag;
    public Peasant(String name, int x, int y) {
        super(name, 45, 45, 4, 2, 5, 1, 1, 0, x, y);
        ammo = 0;
        flag = false;
    }
    public String getInfo(){
        return "Фермер";
    }
    public void step(ArrayList<BaseUnit> targets, ArrayList<BaseUnit> friends) {
        if (getHP() <= 0) return;
        flag = false;
    }
}
