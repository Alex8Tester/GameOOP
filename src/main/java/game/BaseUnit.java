package game;

public abstract class BaseUnit {
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

