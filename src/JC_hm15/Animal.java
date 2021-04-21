package JC_hm15;

public class Animal {

    private String animal_type;
    private String  animal_name;

    public Animal(String animal_type, String animal_name) {
        this.animal_type = animal_type;
        this.animal_name = animal_name;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal_type='" + animal_type + '\'' +
                ", animal_name='" + animal_name + '\'' +
                '}';
    }
}
