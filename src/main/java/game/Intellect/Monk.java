package game.Intellect;
import game.BaseUnit;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;

    public Monk(String name, int x, int y) {
        super(name, 40, 60, 8, 5, 3, 1, 1, 0, 20, 4, x, y);
        this.maxMana = this.mana = 10;
        flag = false;
    }
    public String getInfo() {
        return "Монах";
    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHP() <= 0) return;
        List<BaseUnit> sortList = new ArrayList<>(friend);
        List<BaseUnit> deadList = new ArrayList<>();
        sortList.sort((o1, o2) -> (int) (o1.getHP() - o2.getHP()));
        for (BaseUnit unit : sortList) {
            if (unit.getHP() == 0) {
                deadList.add(unit);
            }
        }

        if (deadList.size() > 3) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadList.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());
            deadList.get(0).setHP(maxHP);
            mana = 0;
            System.out.println("Воскресил: " + deadList.get(0).getName());
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

        Healing(sortList.get(0));
        mana -= 2;
    }
}