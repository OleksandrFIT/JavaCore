package JC_hm9;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Type the 1st number: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Type the 2nd number: ");
        Scanner scanner2 = new Scanner(System.in);
        double b = scanner.nextDouble();

        Task2_num.CheckTheNumbers(a, b);


    }



}