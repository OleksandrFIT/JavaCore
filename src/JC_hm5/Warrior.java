package JC_hm5;

public class Warrior {

    private String id;

    public String EndOfWar(){
        System.out.println("(-------------------)"+"\n"+"Битва завершилась!"+"\n"+"Переміг Воїн №2"+"\n"+"(-------------------)");
        return "";
    }

    public Warrior(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "id='" + id + '\'' +
                '}';
    }
}
