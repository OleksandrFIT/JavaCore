package JC_hm12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        List<String> input = new ArrayList<>();
        System.out.println("Input your words: \n =================");

        //input the words
        inputTheWords(input);

        //Task1
        printTheList(input);

        //Task2
        printWordsStartS(input);

        //Task3
        printWordsLengthGraterThan5(input);


    }

    private static void inputTheWords(List<String> input) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine().toLowerCase();


        while (!words.equals("break")) {
            input.add(words);
            words = scanner.nextLine();
        }

    }


    //Task1
    public static void printTheList(List<String> input){
        System.out.println("================= \n" + input);
    }


    //Task2
    public static void printWordsStartS(List<String> input){
        System.out.println("================= \nOutput words that start with 'S' \n=================");
        for (int i = 0; i < input.size(); i++){
            String sWord = input.get(i);
            if (sWord.charAt(0) == 's'){
                System.out.println(sWord);
            }
        }
        System.out.println("=================");
    }

    //Task3
    public static void printWordsLengthGraterThan5(List<String> input){
        System.out.println("================= \nOutput words that have length grater than 5 \n=================");
        for(int i = 0; i < input.size(); i++){
            String wordSize = input.get(i);
            if (wordSize.length() > 5){
                System.out.println(wordSize);
            }
        }
        System.out.println("=================");
    }

}
