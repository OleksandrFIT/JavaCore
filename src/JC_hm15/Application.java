package JC_hm15;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Person person1 = new Person("Tolya", 20);
        Person person2 = new Person("Artem", 18);
        Person person3 = new Person("Kyrylo", 25);
        Person person4 = new Person("Yana", 30);

        Animal animal1 = new Animal("Dog", "Balu");
        Animal animal2 = new Animal("Dog", "Happy");
        Animal animal3 = new Animal("Cat", "Lily");
        Animal animal4 = new Animal("Mouse", "Mickey");
        Animal animal5 = new Animal("Parrot", "Rio");
        Animal animal6 = new Animal("Cat", "Kitty");
        Animal animal7 = new Animal("Baby Lion", "Leo");
        Animal animal8 = new Animal("Hamster", "Biscuit");

        List<Animal> listPerson1= new ArrayList<>();
        List<Animal> listPerson2= new ArrayList<>();
        List<Animal> listPerson3= new ArrayList<>();
        List<Animal> listPerson4= new ArrayList<>();

        listPerson1.add(animal1);
        listPerson1.add(animal8);
        listPerson2.add(animal3);
        listPerson3.add(animal4);
        listPerson3.add(animal5);
        listPerson4.add(animal2);
        listPerson4.add(animal6);
        listPerson4.add(animal7);


        Map<Person, List<Animal>> map = new HashMap<>();

        map.put(person1, listPerson1);
        map.put(person2, listPerson2);
        map.put(person3, listPerson3);
        map.put(person4, listPerson4);

        System.out.println("Зооклуб: ");
        showMap(map);

        System.out.println("Введіть число для вибора функції з меню:\n" +
                "1) Додати людину до клубу\n" +
                "2) Додати тваринку до людини\n" +
                "3) Видалити(забрати) тваринку від людини\n" +
                "4) Видалити людину з клубу\n" +
                "5) Вивести на екран зооклуб\n" +
                "6) Вийти з програми\n");

        Scanner sc_num = new Scanner(System.in);
        int num = sc_num.nextInt();

        switch (num) {
            case 1: {
                putPersonToMap(map, addPerson(), addAnimal());
            }break;

            case 2: {
                addAnimalToPerson(map, person2, addAnimal());
            }

            case 3: {
                removeAnimalFromPerson(map, person4, animal6);
            }

            case 4: {
                removePersonFromMap(map, person2);
            }

            case 5:{
                showMap(map);
            }

            case 6:{
                exitP();
            }
        }


    }


    public static void showMap(Map<Person, List<Animal>> map){
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()){
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }

    public static Person addPerson(){
        Person person5 = new Person("Nikita", 11);
        return person5;
    }

    public static List<Animal> addAnimal(){
        List<Animal> listPerson5 = new ArrayList<>();
        return listPerson5;
    }

    //////
    public static Map<Person, List<Animal>>putPersonToMap (Map<Person, List<Animal>> map, Person person5, List<Animal> listPerson5){
        map.put(person5, listPerson5);
        return map;
    }

    //////
    public static Map<Person, List<Animal>> addAnimalToPerson(Map<Person, List<Animal>> map, Person person2, List<Animal> listPerson5){
        Animal animal9 = new Animal("Lizard", "Mo");
        Animal animal10 = new Animal("Snake", "Boa");
        listPerson5.add(animal9);
        listPerson5.add(animal10);
        map.put(person2, listPerson5);
        return map;
    }

    ///////
    public static Map<Person, List<Animal>> removeAnimalFromPerson(Map<Person, List<Animal>> map, Person person4, Animal animal6){
        map.get(person4).remove(animal6);
        return map;
    }

    public static Map<Person, List<Animal>> removePersonFromMap(Map<Person, List<Animal>> map, Person person2){
        map.remove(person2);
        return map;
    }

    public static void exitP(){
        System.exit(0);
    }


}
