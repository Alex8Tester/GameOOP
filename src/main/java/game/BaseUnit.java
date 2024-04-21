package game;

abstract class BaseUnit {
    private String name;
    private int HP;
    private int maxHP;
    private int attack;
    private int attackRange;
    private int defend;
    private int initiative;
    private int level;
    private int experience;

    public BaseUnit(String name, int HP, int maxHP, int attack, int attackRange, int defend,
                int initiative, int level, int experience){
        this.name = name;
        this.maxHP = this.HP = HP;
        this.attack = attack;
        this.attackRange = attackRange;
        this.defend = defend;
        this.initiative = initiative;
        this.level = level;
        this.experience = experience;
    }

    public String toString() {
        return "Unit ";
    }

    public void print(){
        System.out.println("Name: "+ name + "Lvl: "+ level);
    }

    public void GetDamage(int damage){
        if(this.HP - damage > 0){
            this.HP -= damage;
        }
    }
    public void Attack(BaseUnit target){
    }


}
class Intellect extends BaseUnit{
    private int intellect;
    private int magic;
    private int maxMagic;
    public Intellect(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience,
                     int intellect, int magic, int maxMagic) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience);
        this.intellect = intellect;
        this.maxMagic = this.magic = magic;
    }
}
class Strength extends BaseUnit{
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
class Agility extends BaseUnit{
    private int agility;
    public Agility(String name, int HP, int maxHP, int attack, int attackRange, int defend, int initiative, int level, int experience,
                   int agility) {
        super(name, HP, maxHP, attack, attackRange, defend, initiative, level, experience);
        this.agility = agility;
    }
}
