package JC_hm9;

public class Task2_num {

    private static double sum;


    public static void CheckTheNumbers(double a, double b){
        if ((Math.floor(a)-a) != 0 || (Math.floor(b)-b) != 0 ){
            throw new RuntimeException("At least one of your numbers is Double");
        } else {
            sum = a + b;
            System.out.println("Sum is " + sum);
        }

    }



}