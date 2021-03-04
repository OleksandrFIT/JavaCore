package JC_hm4.Task2;

public class Helm {
    private double diametr;

    Helm (double diametr){
        this.diametr= diametr;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public void changeDiametr(double diametr1) {
        diametr1= diametr*0.75;
    }


    @Override
    public String toString() {
        return "Helm [diametr=" + diametr + "]";
    }
}
