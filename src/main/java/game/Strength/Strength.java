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

    @Override
    public void GetDamage(int damage) {
        if (this.HP - damage > 0) {
            this.HP -= damage;
        }
    }
    @Override
    public void Attack(BaseUnit target) {

    }

    @Override
    public void Healing(BaseUnit target) {

    }

    @Override
    public void Attack(BaseUnit target) {

    }

    @Override
    public void Healing(BaseUnit target) {

    }
}
