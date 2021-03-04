package JC_hm4.Task2;

public class Car {
    private int age;
    private double fuelUsing;
    private Body type;
    private Helm diameter;
    private Wheel size;

    Car(int age, double fuelUsing, Body type, Helm diameter, Wheel size){
        this.age=age;
        this.fuelUsing=fuelUsing;
        this.type= type;
        this.diameter=diameter;
        this.size= size;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFuelUsing() {
        return fuelUsing;
    }

    public void setFuelUsing(double fuelUsing) {
        this.fuelUsing = fuelUsing;
    }

    public Body getType() {
        return type;
    }

    public void setType(Body type) {
        this.type = type;
    }

    public Helm getDiametr() {
        return diameter;
    }

    public void setDiametr(Helm diametr) {
        this.diameter = diametr;
    }

    public Wheel getSize() {
        return size;
    }

    public void setSize(Wheel size) {
        this.size = size;
    }

    public void changeYear(int age1) {
        age= age1;
    }
    public void changeFuel(double fuelUsing1) {
        fuelUsing=fuelUsing1;
    }

    @Override
    public String toString() {
        return "Car [age=" + age + ", fuelUsing=" + fuelUsing + ", type=" + type + ", diametr=" + diameter + ", size="
                + size + ", getAge()=" + getAge() + ", getFuelUsing()=" + getFuelUsing() + ", getType()=" + getType()
                + ", getDiametr()=" + getDiametr() + ", getSize()=" + getSize() + "]";
    }

}
