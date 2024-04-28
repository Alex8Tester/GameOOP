package game.Intellect;

import game.BaseUnit;

class Intellect extends BaseUnit {
    private int intellect;
    private int magic;
    private int maxMagic;

    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative,
                     int level, int experience, int intellect, int magic, int maxMagic) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience);
        this.intellect = intellect;
        this.maxMagic = this.magic = magic;
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
}
