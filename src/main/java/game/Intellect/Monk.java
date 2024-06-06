package game.Intellect;
import game.BaseUnit;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Monk extends Intellect {
    protected int mana;
    protected int maxMana;

    public Monk(String name, int x, int y) {
        super(name, 90, 90, 8, 8, 7, 1, 1, 0, 70, 4, x, y);
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
        List<BaseUnit> deadList = sortList.stream()
                .filter(BaseUnit -> BaseUnit.getHP() == 0)
                .collect(Collectors.toList());

        if (deadList.size() > 3) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
            deadList.sort(Comparator.comparingInt(unit -> BaseUnit.speed).reversed());
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

        sortList.get(0).setHP(sortList.get(0).getHP() + 10);
        mana -= 2;
    }
}