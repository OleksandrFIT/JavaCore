package Lesson17_Present_16_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String inputString = "This is simple text that contains phone number 0982344265";
        String pattern = "(\\d+)";

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(inputString);

        if (matcher.find()){
            System.out.println("Phone number: "+ matcher.group(0));
        } else {
            System.out.println("PHONE NUMBER IS NOT FOUND");
        }
    }

}
