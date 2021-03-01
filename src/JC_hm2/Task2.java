package JC_hm2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        System.out.println("Заповніть масив ");
        Scanner scArray= new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Введіть " + i + " елемент:");
            int sc= scArray.nextInt();
            nums.add(sc);
        }

        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);




        /*
        System.out.print ("Масив:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print (" " + nums[i]);
        }*/



    }
}
