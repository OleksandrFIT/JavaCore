package JC_hm4.Task3;

public class Application {
    public static void main(String[] args) {

        Animal a= new Animal("Леопард", 20, 7);
        System.out.println("\"Назва тварини= " + a.getName() + ", Швидкість тварини=" + a.getSpeedOfAnimal() +" км/год "+ ", Вік тварини=" + a.getAge() + " років" +"\n"+ "———————————————————————————-\"");

        a.setName("Бик");
        a.setSpeedOfAnimal(2);
        a.setAge(14);
        System.out.println("\"Назва тварини= " + a.getName() + ", Швидкість тварини=" + a.getSpeedOfAnimal() +" км/год "+ ", Вік тварини=" + a.getAge() + " років\"");
    }
}
