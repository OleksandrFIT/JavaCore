package JC_hm11;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        String str = "I love Java more than my friend. Java is so beautiful.";

        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(str);

        //Part 1
        System.out.println(matcher.find());

        //Part 2
        String t2 = str.replaceFirst("Java", "C#");
        System.out.println(t2);

        //Part3
        String t3 = str.replaceAll("Java", "C#");
        System.out.println(t3);

    }

}
