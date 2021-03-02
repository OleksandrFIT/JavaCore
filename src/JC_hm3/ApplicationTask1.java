package JC_hm3;

public class ApplicationTask1 {
    public static void main(String[] args) {

        Rectangle_Task1 rectangleNoParam= new Rectangle_Task1();
        Rectangle_Task1 rectangleWParams= new Rectangle_Task1(2.4, 3.12);

        System.out.println("Площа прямокутника = " + rectangleWParams.countSquare());
        System.out.println("Периметр прямокутника = " + rectangleWParams.countPerimeter());

    }
}
