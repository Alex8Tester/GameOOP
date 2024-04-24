package game.Agility;

import game.Agility.Agility;

public class Sniper extends Agility {
    int accuracy;
    int ammo;
    public Sniper(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience, int agility) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, agility);
    }
}
