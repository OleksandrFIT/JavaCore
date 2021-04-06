package JC_hm9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Put your number: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        SolveTheNum(a);

    }

    public static void SolveTheNum(double a){
        if ((Math.floor(a)-a) != 0 ){
            throw new IllegalArgumentException("Your number is not Integer");
        } else if(a % 2 == 0){
            System.out.println(a + " is an even number");
        } else {
            System.out.println(a + " is an odd number");
        }
    }

}