package JC_hm3;

import javax.swing.*;

public class Circle_Task2 {

    private double r;
    private double d;

    public Circle_Task2(){
        this.r = 4.82;
        this.d = 9.64;
    }
    // sq- d
    //c r

    public double square(){
        System.out.println("Площа кола = "+ Math.PI * Math.pow(d/2, 2));
        return 0;
        //JOptionPane.showMessageDialog("Square = "+ Math.PI * Math.pow(d/2, 2));
    }

    public double length(){
        System.out.println("Довжина кола = "+ 2* Math.PI * r);
        return 0;
    }

}
