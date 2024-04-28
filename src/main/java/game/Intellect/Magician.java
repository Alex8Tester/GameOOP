package game.Intellect;

public class Magician extends Intellect {
    int mana;
    int maxMana;
    public Magician(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative,
                    int level, int experience, int intellect, int magic, int maxMagic) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience, intellect, magic, maxMagic);
        this.maxMana = this.mana = mana;
    }
    @Override
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
