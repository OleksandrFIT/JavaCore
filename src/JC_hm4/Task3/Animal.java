package JC_hm4.Task3;

public class Animal {

    private String name;
    private int speedOfAnimal;
    private int age;

    public Animal(String name, int speedOfAnimal, int age) {
        this.name = name;
        this.speedOfAnimal = speedOfAnimal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedOfAnimal() {
        return speedOfAnimal;
    }

    public void setSpeedOfAnimal(int speedOfAnimal) {
        this.speedOfAnimal = speedOfAnimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
