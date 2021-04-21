package JC_hm11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {

        System.out.println("Введіть будь-які слова: ");

        Scanner sc_w= new Scanner(System.in);
        String words = sc_w.next().toLowerCase();
        List<String> list = new LinkedList<>();

        while (!words.equals("stop")){

            Pattern regex = Pattern.compile("[^a]");
            Matcher matcher = regex.matcher(words);
            list.add();
            words = sc_w.next().toLowerCase();
        }
        System.out.println(list);


    }
}
