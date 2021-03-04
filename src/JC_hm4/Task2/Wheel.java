package JC_hm4.Task2;

public class Wheel {
    private double size;

    Wheel (double size){
        this.size= size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void changeSize(double size1) {
        size1= size+2.5;
    }

    @Override
    public String toString() {
        return "Body [size=" + size + "]";
    }

}
