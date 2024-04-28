package game;
import java.util.List;

public abstract class BaseUnit implements MyInterface {
    protected String name;
    protected int HP;
    protected int maxHP;
    protected int attack;
    protected int attackRange;
    protected int defend;
    protected int initiative;
    protected int level;
    protected int experience;

    Position position;
    public BaseUnit(String name, int HP, int maxHP, int attack, int attackRange, int defend,
                int initiative, int level, int experience, int x, int y){
        this.name = name;
        this.maxHP = this.HP = HP;
        this.attack = attack;
        this.attackRange = attackRange;
        this.defend = defend;
        this.initiative = initiative;
        this.level = level;
        this.experience = experience;
        position = new Position(x, y);
    }

    public String getInfo() {
        return String.format("Name: %s HP: %d LVL: %d", this.name, this.hp, this.level);
    }

    public String getInfoPos() {
        return String.format("Name: %s HP: %d Position: %s", this.name, this.hp, position);
    }
    public void GetDamage(int damage) {
        if (this.HP - damage > 0) {
            this.HP -= damage;
        }
    }
    public void Attack(BaseUnit target) {
        int damage = this.attack - target.defense;
    }
    public void Healing(BaseUnit target) {
        int heal = this.attack;
        target.HP += heal;
        if (target.HP > target.maxHP) {
            target.HP = target.maxHP;
        }
    }
    /**
     * Method searching nearby enemy
     * @param targets list of enemies
     * @return nearby enemy
    */
    public BaseUnit findNearestTarget(List<BaseUnit> targets) {
        if (targets == null || targets.isEmpty()) {
            throw new IllegalArgumentException("Enemies was not found!");
        }
        BaseUnit nearestTarget = null;
        double minDistanse = Double.MAX_VALUE;
        for (BaseUnit target : targets) {
            double distance = this.position.getDistance(target.position);
            if (distance < minDistanse) {
                minDistanse = distance;
                nearestTarget = target;
            }
        }
        return nearestTarget;
    }
}

