package game.Strength;

public class Spearman extends Strength {
    int armor;
    public Spearman(String name, int HP, int maxHP, int attack, int attackRange, int defense, int initiative, int level,
                    int experience, int strength, int stamina, int maxStamina, int armor) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience);
        this.armor = armor;
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
