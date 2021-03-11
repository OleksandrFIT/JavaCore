package JC_hm5;

public class Warrior_1 extends Warrior {

    private int hp = 1000;
    private String weapon = "Ніж(200)";
    private int damage = 200;
    Warrior_3 warrior3 = new Warrior_3("3");

    public Warrior_1(String id) {
        super(id);
        this.hp=hp;
        this.weapon=weapon;
        this.damage=damage;
    }

    public String HpRound1(){
        System.out.println("Воїн №1: 700 hp");
        return "";
    }

    public String Warrior1Round1(){
        System.out.println("Воїн № "+ getId()+ " атакує Воїна № "+ warrior3.getId());
        return "";
    }

    public String HpRound2(){
        System.out.println("Воїн №1: 200 hp");
        return "";
    }

    public String HpRound3(){
        System.out.println("Воїн №1: -100 hp"+ "\n" + "Воїн №1: Помер");
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
        return "Warrior_1{" +
                "hp=" + hp +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                '}';
    }
}
