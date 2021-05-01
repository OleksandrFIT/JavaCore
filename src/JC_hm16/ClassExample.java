package JC_hm16;

public class ClassExample {

    private String personName;
    private int age;
    private int address;

    public ClassExample() {
    }

    public ClassExample(String personName, int age, int address) {
        this.personName = personName;
        this.age = age;
        this.address = address;
    }



    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
