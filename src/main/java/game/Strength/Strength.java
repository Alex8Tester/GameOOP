package game.Strength;

import game.BaseUnit;

class Strength extends BaseUnit {
    private int strength;
    private int stamina;
    private int maxStamina;

    public Strength(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience,
                    int strength, int stamina, int maxStamina) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience);
        this.strength = strength;
        this.maxStamina = this.stamina = stamina;

    }
}
