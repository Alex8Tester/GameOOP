package game.Intellect;

import game.BaseUnit;

class Intellect extends BaseUnit {
    private int intellect;
    private int magic;
    private int maxMagic;

    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience,
                     int intellect, int magic, int maxMagic) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience);
        this.intellect = intellect;
        this.maxMagic = this.magic = magic;
    }
}
