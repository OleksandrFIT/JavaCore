package JC_hm3;

import javax.swing.*;

public class Circle_Task2 {

    private double r;
    private double d;

    public Circle_Task2(double r, double d){
        this.r = r;
        this.d = d;
    }
    // sq- d
    //c r

    public double square(){
        return Math.PI * Math.pow(d/2, 2);
        //JOptionPane.showMessageDialog("Square = "+ Math.PI * Math.pow(d/2, 2));
    }

    public double length(){
        return 2* Math.PI * r;
    }

}
