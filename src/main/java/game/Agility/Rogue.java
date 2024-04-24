package game.Agility;

import game.Agility.Agility;

public class Rogue extends Agility {
    int venom;
    double stealth;
    public Rogue(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience, int agility) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, agility);
    }
}
