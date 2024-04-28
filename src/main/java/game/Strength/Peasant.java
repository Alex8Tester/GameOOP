package game.Strength;

public class Peasant extends Strength {

    public Peasant(String name, int HP, int maxHP, int attack, int attackRange, int defense, int damage_resist, int initiative, int level, int experience) {
        super(name, HP, maxHP, attack, attackRange, defense, initiative, level, experience);
    }
    public String getInfo() {
        return String.format("Class: %s %s", getClass().getSimpleName(), super.getInfo());
    }
}
