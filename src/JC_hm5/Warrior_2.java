package JC_hm5;

public class Warrior_2 extends Warrior {

    private int hp = 800;
    private String weapon = "Шабля(300)";
    private int damage = 300;
    Warrior_1 warrior1 = new Warrior_1("1");
    Warrior_3 warrior3 = new Warrior_3("3");

    public Warrior_2(String id) {
        super(id);
        this.hp=hp;
        this.weapon=weapon;
        this.damage=damage;
    }

    public String Warrior2Round1(){
        System.out.println("Воїн № "+ getId()+ " атакує Воїна № "+ warrior1.getId());
        return "";
    }
    public String Warrior2Round2(){
        System.out.println("Воїн № "+ getId()+ " атакує Воїна № "+ warrior3.getId());
        return "";
    }

    public String Warrior2Round3(){
        System.out.println("Воїн № "+ getId()+ " атакує Воїна № "+ warrior1.getId());
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
        return "Warrior_2{" +
                "hp=" + hp +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                '}';
    }
}
