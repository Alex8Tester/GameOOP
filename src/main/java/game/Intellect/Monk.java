package game.Intellect;
import game.BaseUnit;

import java.util.ArrayList;
import java.util.List;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;
    boolean flag;

    public Monk(String name, int x, int y) {
        super(name, 90, 90, 8, 8, 7, 1, 1, 0, 70, x, y);
        this.maxMana = this.mana = 20;
        flag = false;
    }
    public String getInfo() {
        return "Монах";
    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHP() <= 0) return;
        ArrayList<BaseUnit> sortlist = new ArrayList<>(friend);
        ArrayList<BaseUnit> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> (int) (o1.getHP() - o2.getHP()));
        for (BaseUnit unit : sortlist) {
            if (unit.getHP() == 0) {
                deadlist.add(unit);
            }
        }
        if (deadlist.size() > 3 ) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadlist.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());
            deadlist.getFirst().setHp(maxHP);
            mana = 0;
            System.out.println("Воскресил: " + deadlist.getFirst().getName());
            flag = false;
            return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        Healing(sortlist.getFirst());
        mana -= 2;
    }
}