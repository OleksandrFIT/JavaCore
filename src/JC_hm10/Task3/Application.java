package JC_hm10.Task3;

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

        for (int i = 0; i < arr.length; i++){

            if (arr[i].startsWith("а") && (arr[i].length() % 2 == 0)){
                System.out.print("Слова, які начинаються на (а), та мають парну кількість символів: " + arr[i]+ "; ");
            }

        }

    }
}