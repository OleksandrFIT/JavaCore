package JC_hm5;

public class Application {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("");
        Warrior_1 warrior1 = new Warrior_1("1");
        Warrior_2 warrior2 = new Warrior_2("2");
        Warrior_3 warrior3 = new Warrior_3("3");

        System.out.println("Воїн № "+ warrior1.getId() + "\n" + "Зброя: " +  warrior1.getWeapon() + "\n"+ "Сила: " + warrior1.getDamage() +"\n"+ "======================");
        System.out.println("Воїн № "+ warrior2.getId() + "\n" + "Зброя: " +  warrior2.getWeapon() + "\n"+ "Сила: " + warrior2.getDamage() +"\n"+ "======================");
        System.out.println("Воїн № "+ warrior3.getId() + "\n" + "Зброя: " +  warrior3.getWeapon() + "\n"+ "Сила: " + warrior3.getDamage() +"\n"+ "======================");

        System.out.println("=-=-=-=-=-=-=-=-=-=-"+"\n"+"        WAR"+"\n"+"=-=-=-=-=-=-=-=-=-=-");
        System.out.println(warrior2.Warrior2Round1() + "\n" + warrior1.HpRound1());
        System.out.println(warrior1.Warrior1Round1() + "\n" + warrior3.HpRound1());
        System.out.println(warrior3.Warrior3Round1() + "\n" + warrior1.HpRound2());
        System.out.println(warrior2.Warrior2Round2() + "\n" + warrior3.HpRound2());
        System.out.println(warrior2.Warrior2Round3() + "\n" + warrior1.HpRound3());
        System.out.println(warrior.EndOfWar());


    }
}
