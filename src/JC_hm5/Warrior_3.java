package JC_hm5;

public class Warrior_3 extends Warrior{

    private int hp = 500;
    private String weapon = "Пістолет(500)";
    private int damage = 500;


    public Warrior_3(String id) {
        super(id);
        this.hp=hp;
        this.weapon=weapon;
        this.damage=damage;
    }

    public String HpRound1(){
        System.out.println("Воїн №3: 300 hp");
        return "";
    }

    public String Warrior3Round1(){
        System.out.println("Воїн № "+ getId()+ " атакує Воїна № 1");
        return "";
    }

    public String HpRound2(){
        System.out.println("Воїн №3: 0 hp"+"\n"+"Воїн № 3: Помер");
        return "";
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Warrior_3{" +
                "hp=" + hp +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                '}';
    }
}
