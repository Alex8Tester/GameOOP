package game.Strength;
import game.BaseUnit;
import java.util.ArrayList;


public class Peasant extends Strength {
    int ammo;
    public Peasant(String name, int x, int y) {
        super(name, 45, 50, 5, 2, 1, 1, 1, 0, 7, x, y);
        ammo = 12;
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
