package JC_hm4.Task1;

public class Application {

    public static void main(String[] args) {

        Robot []array = new Robot[4];
        array[0] = new Robot();
        array[1] = new RobotCoocker();
        array[2] = new CoffeRobot();
        array[3] = new RobotDancer();

        for (int i = 0; i < array.length; i++){
            array[i].work();
        }

    }


}
