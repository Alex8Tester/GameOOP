package game.Agility;

import game.Agility.Agility;

public class Crossbowman extends Agility {
    int bolt;
    int accuracy;
    public Crossbowman(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience, int agility) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, agility);
    }
}