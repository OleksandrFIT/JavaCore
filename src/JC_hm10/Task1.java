package JC_hm10;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {

        String str = "I love Java !!!";

        char ls = str.charAt(getLastSymbol(str));
        System.out.println("Answer to A: " + ls);

        boolean endsW = str.endsWith("!!!");
        System.out.println("Answer to B: "+ endsW);

        boolean startsW = str.startsWith("I like");
        System.out.println("Answer to C: " + startsW);

        int word = str.indexOf("Java");
        if(word == -1){
            System.out.println("Answer to D: false");
        }
        else{
            System.out.println("Answer to D: true");
        }


        System.out.println("Answer to E: " + word);

        String repl= str.replace("a", "o");
        System.out.println("Answer to F: " + repl);


        System.out.println("Answer to G: " + str.toUpperCase(Locale.ROOT));
        System.out.println("Answer to H: " + str.toLowerCase(Locale.ROOT));
        System.out.println("Answer to I: " + str.substring(7, 11));


    }

    public static int getLastSymbol(String str){
        int lastS = str.length() -1;
        return lastS;
    }

}