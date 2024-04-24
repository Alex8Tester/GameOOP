package game.Agility;

import game.BaseUnit;

class Agility extends BaseUnit {
    private int agility;

    public Agility(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience,
                   int agility) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience);
        this.agility = agility;
    }
}
