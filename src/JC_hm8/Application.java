package JC_hm8;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Month [] mas = Month.values();
        Season [] sMas = Season.values();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            switch (sc.next()) {
                case "1": {
                    System.out.println("Введіть місяць: ");
                    sc = new Scanner(System.in);
                    String month = sc.next().toUpperCase();

                    Boolean flag = Month.isMonth(mas, month);

                    if (!flag) {
                        System.out.println("Місяць не існує");
                    }
                }
                break;

                case "2":{
                    System.out.println("Введіть сезон: ");
                    sc= new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    Boolean flag= false;

                    for (Season s : Season.values()) {
                        if (s.name().equals(season)) {
                            flag= true;
                            break;
                        }
                    }

                    if (flag) {
                        for (Month mon : mas) {
                            if (mon.getSeason().toString().equalsIgnoreCase(season)) {
                                System.out.println(mon);
                            }
                        }
                    }
                    else {
                        System.out.println("Сезон не існує");
                    }
                }
                break;

                case "3": {
                    System.out.println("Введіть місяць: ");
                    sc= new Scanner(System.in);
                    String scDays= sc.next().toUpperCase();

                    Boolean flag = Month.isMonth(mas, scDays);

                    if (flag) {
                        int numDays = 0;
                        for (Month mon : mas){
                            if(mon.toString().equalsIgnoreCase(scDays)){
                                numDays = mon.getDays();
                                break;
                            }
                        }
                        for (Month mon : mas) {
                            if (mon.getDays() == numDays) {
                                System.out.println(mon);
                            }
                        }
                    }
                    else {
                        System.out.println("Місяць не існує");
                    }
                }
                break;

                case "4":
                {
                    System.out.println("Введіть кількість днів: ");
                    sc= new Scanner(System.in);
                    int scDays= sc.nextInt();

                    if (scDays <= 28)
                    {
                        System.out.println("Місяців не знайдено!");
                    }
                    else{
                        for (Month mon : mas) {
                            if (mon.getDays() < scDays) {
                                System.out.println(mon);
                            }
                        }
                    }
                }
                break;

                case "5":
                {
                    System.out.println("Введіть кількість днів: ");
                    sc= new Scanner(System.in);
                    int scDays= sc.nextInt();

                    if (scDays >= 31)
                    {
                        System.out.println("Місяців не знайдено!");
                    }
                    else{
                        for (Month mon : mas) {
                            if (mon.getDays() > scDays) {
                                System.out.println(mon);
                            }
                        }
                    }
                }
                break;
                //case 6

                case "6":{
                    System.out.println("Введіть сезон: ");
                    sc= new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    Boolean flag= false;


                    for (Season s : Season.values()) {
                        if (s.name().equals(season)) {
                            flag= true;
                            String s1 = season;
                            break;
                        }
                    }

                    if (flag) {
                        Season s1 = Season.valueOf(season);
                        int ordinal = s1.ordinal();

                        if(ordinal == (sMas.length-1)) {
                            ordinal = 0;
                            System.out.println(sMas[ordinal]);
                        }else {
                            System.out.println(sMas[ordinal+1]);
                        }
                    }

                    if(!flag) {
                        System.out.println("Сезон не існує");
                    }

                }
                break;

                // case 7
                case "7":{
                    System.out.println("Введіть сезон: ");
                    sc= new Scanner(System.in);
                    String season = sc.next().toUpperCase();

                    Boolean flag= false;


                    for (Season s : Season.values()) {
                        if (s.name().equals(season)) {
                            flag= true;
                            String s1 = season;
                            break;
                        }
                    }

                    if (flag) {
                        Season s1 = Season.valueOf(season);
                        int ordinal = s1.ordinal();

                        if(ordinal == (sMas.length-1)) {
                            ordinal = 0;
                            System.out.println(sMas[ordinal]);
                        }else {
                            System.out.println(sMas[ordinal-1]);
                        }
                    }

                    if(!flag) {
                        System.out.println("Сезон не існує");
                    }

                }
                break;


                case "8":
                {
                    System.out.println("Введіть кількість днів: ");
                    sc= new Scanner(System.in);
                    int scDays= sc.nextInt();

                    if (scDays %2 == 1)
                    {
                        System.out.println("Місяців не знайдено!");
                    }
                    else{
                        for (Month mon : mas) {
                            if (mon.getDays() %2 == 0) {
                                System.out.println(mon);
                            }
                        }
                    }
                }
                break;
                case "9":
                {
                    System.out.println("Введіть кількість днів: ");
                    sc= new Scanner(System.in);
                    int scDays= sc.nextInt();

                    if (scDays %2 == 0)
                    {
                        System.out.println("Місяців не знайдено!");
                    }
                    else{
                        for (Month mon : mas) {
                            if (mon.getDays() %2 == 1) {
                                System.out.println(mon);
                            }
                        }
                    }
                }
                break;
                // case 10 не знаю
                case "10": {
                    System.out.println("Введіть місяць: ");
                    sc= new Scanner(System.in);
                    String scDays= sc.next().toUpperCase();

                    Boolean flag = Month.isMonth(mas, scDays);

                    if (flag) {
                        int numDays = 0;
                        for (Month mon : mas){
                            if(mon.toString().equalsIgnoreCase(scDays)){
                                numDays = mon.getDays();
                                break;
                            }
                        }
                        if (numDays %2 == 0) {
                            System.out.println(scDays +" "+ "має парну кількість днів");
                        } else {
                            System.out.println(scDays +" "+ "має непарну кількість днів");
                        }
                    }

                    else {
                        System.out.println("Місяць не існує");
                    }
                }
                break;
            }
        }

    }




    static void menu() {
        System.out.println("Натисніть 1 щоб перевірити чи такий місяць існує.");
        System.out.println("Натисніть 2 щоб вивести всі місяці з такою ж порою року.");
        System.out.println("Натисніть 3 щоб вивести місяці з однаковою кількістю днів.");
        System.out.println("Натисніть 4 щоб вивести на екран всі місяці які мають меншу кількість днів.");
        System.out.println("Натисніть 5 щоб вивести на екран всі місяці які мають більшу кількість днів.");
        System.out.println("Натисніть 6 щоб вивести на екран наступну пору року.");
        System.out.println("Натисніть 7 щоб вивести на екран попередню пору року.");
        System.out.println("Натисніть 8 щоб вивести на екран всі місяці які мають парну кількість днів.");
        System.out.println("Натисніть 9 щоб вивести на екран всі місяці які мають непарну кількість днів.");
        System.out.println("Натисніть 10 щоб вивести на екран чи введений з консолі місяць має парну кількість днів.");

    }

}
