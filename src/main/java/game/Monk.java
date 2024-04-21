package game;

public class Monk extends Intellect {
    int mana;
    int maxMana;

    public Monk(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience, int intellect, int magic, int maxMagic) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, intellect, magic, maxMagic);
    }
}