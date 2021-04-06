package JC_hm10.Task2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        System.out.println("Введіть к-ть слів: ");
        Scanner n_sc = new Scanner(System.in);
        int n = n_sc.nextInt();


        String []arr = new String[n];
        int []lArr = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.println("Word number " + (i+1) + ": ");
            Scanner sc_word = new Scanner(System.in);
            String word = sc_word.next();
            arr[i] = word;

        }

        for (int i = 0; i< arr.length; i++){
            //   System.out.print(arr[i]+ ", ");
            lArr[i] = arr[i].length();

            System.out.println(arr[i] + " : " + lArr[i]);
        }


        int fIndex = 0;
        String maxWord = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (maxWord.length() < arr[i].length()){
                fIndex = i;
                maxWord = arr[i];
            }
        }
        System.out.println("Найдовше слово " + maxWord + " /// під індексом: " + fIndex);

        int sIndex = 0;
        String minWord = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (minWord.length() > arr[i].length()){
                sIndex = i;
                minWord = arr[i];
            }
        }
        System.out.println("Найкоротше слово: " + minWord + " /// під індексом: " + sIndex);


    }




}