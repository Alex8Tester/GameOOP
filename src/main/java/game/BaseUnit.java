package game;

public abstract class BaseUnit {
    protected String name;
    protected int HP;
    protected int maxHP;
    protected int attack;
    protected int attackRange;
    protected int defend;
    protected int initiative;
    protected int level;
    protected int experience;

    Place position;
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
        position = new Place(x, y);
    }

    public String getInfo(){
        return String.format("Name: %s HP: %d LVL: %d", this.name, this.HP, this.level);
    }

    public abstract void GetDamage(int damage);
    public abstract void Attack(BaseUnit target);
    public abstract void Healing(BaseUnit target);


}

