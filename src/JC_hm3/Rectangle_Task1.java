package JC_hm3;

public class Rectangle_Task1 {
    private double length;
    private double width;

    public Rectangle_Task1(){}

    public Rectangle_Task1(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double countSquare(){
        return length * width;
    }

    public double countPerimeter(){
        return ( length + width ) * 2 ;
    }
}
