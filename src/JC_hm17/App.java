/**
 * Реалізовуємо консольну програму. Створити клас Commodity. Описати даний клас: поля методи.
 * Повинні бути такі методи:
 * Додати товар
 * Видалити товар
 * Замінити товар
 * Сортувати за назвоню
 * Сортувати за довжиною
 * Сортувати за шириною
 * Сортувати за вагою
 * Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
 * Вийти з програми(підказка System.exit)
 * Для меню використати Switch.
 */

package JC_hm17;

import java.util.*;

public class App {

    public static void main(String[] args) {

        List<Commodity> thing = new ArrayList<>();
        //Додавання нового елементу списка (зі створенням об'єкту класу Commodity в App)
        thing.add(new Commodity("Laptop", 40, 25, 2));
        thing.add(new Commodity("Table", 160, 70, 10));
        thing.add(new Commodity("Refrigerator", 60, 60, 30));
        thing.add(new Commodity("TV-set", 120, 60, 15));
        thing.add(new Commodity("Perfume", 15, 15, 1));
        thing.add(new Commodity("Teddy Bear", 180, 50, 8));

        printTheList(thing);

        switchMenu(thing);

    }

    //print the list
    public static void printTheList(List<Commodity> thing){
        System.out.println(thing);
    }

    public static void addElementsToTheList(List<Commodity> thing){
        System.out.println("Введіть к-ть нових елементів: ");
        Scanner sc_num = new Scanner(System.in);
        int num = sc_num.nextInt();

        for(int i = 0; i < num; i++ ){
            System.out.println("Enter the name: ");
            Scanner commodityScanner = new Scanner(System.in);
            String word = commodityScanner.next();
            System.out.println("Enter the length: ");
            Scanner sc_length = new Scanner(System.in);
            int length = sc_length.nextInt();
            System.out.println("Enter the width: ");
            Scanner sc_width = new Scanner(System.in);
            int width = sc_width.nextInt();
            System.out.println("Enter the weight: ");
            Scanner sc_weight = new Scanner(System.in);
            int weight= sc_weight.nextInt();

            thing.add(new Commodity(word, length, width, weight));
        }

        System.out.println(thing);

    }


    public static void SetAnElement(List<Commodity> thing){
        System.out.println("Введіть номер елементу, який ви хочете видалити: ");
        Scanner i_scan = new Scanner(System.in);
        int i = i_scan.nextInt();
        Iterator<Commodity> remove= thing.iterator();

        int e = 0;
        while (remove.hasNext()){
            remove.hasNext();
            if (i == e){
                remove.remove();
            }
        }

        System.out.println("Елемент №: " + i + " був видалений.");
        System.out.println(thing);

    }

    public static void removeANElement(List<Commodity> thing){
        System.out.println("Введіть номер елементу, який ви хочете замінити: ");
        Scanner i_scan = new Scanner(System.in);
        int i = i_scan.nextInt();

        System.out.println("Enter the name: ");
        Scanner commodityScanner = new Scanner(System.in);
        String word = commodityScanner.next();
        System.out.println("Enter the length: ");
        Scanner sc_length = new Scanner(System.in);
        int length = sc_length.nextInt();
        System.out.println("Enter the width: ");
        Scanner sc_width = new Scanner(System.in);
        int width = sc_width.nextInt();
        System.out.println("Enter the weight: ");
        Scanner sc_weight = new Scanner(System.in);
        int weight= sc_weight.nextInt();

        Iterator<Commodity> remove= thing.iterator();

        int e = 0;
        while (remove.hasNext()){
            remove.hasNext();
            if (i == e){
                thing.set(i, new Commodity(word, length, width, weight));
            }
        }

        System.out.println("Елемент №: " + i + " був замінений.");
        System.out.println(thing);

    }

    public static void getIElement(List<Commodity> thing){
        System.out.println("Введіть номер елементу, який ви хочете ортимати: ");
        Scanner i_sc = new Scanner(System.in);
        int i = i_sc.nextInt();
        System.out.println(thing.get(i));

    }

    public static void exit(List<Commodity> thing){
        System.exit(0);
    }

    public static void switchMenu(List<Commodity> thing){
        System.out.println(
                "Оберіть операцію: \n" +
                "1) Додати товар. \n" +
                "2) Видалити товар. \n" +
                "3) Замінити товар. \n" +
                "4) Сортувати за назвою. \n" +
                "5) Сортувати за вагою. \n" +
                "6) Сортувати за довжиною. \n" +
                "7) Сортувати за шириною. \n" +
                "8) Виводимо і-тий елемент колекції. \n" +
                "9) Вийти з програми."
        );
        System.out.println("Введіть номер операції для її виконання: ");
        Scanner sc_Onum = new Scanner(System.in);
        int numberOp = sc_Onum.nextInt();

        switch (numberOp){
            case 1: {
                addElementsToTheList(thing);
                exit(thing);
            } break;

            case 2: {
                removeANElement(thing);
            } break;


            case 3: {
                SetAnElement(thing);
            } break;


            case 4: {
                AnonymousName anonymousName = new AnonymousName() {
                };
                Collections.sort(thing, anonymousName);
                System.out.println(thing);
            } break;

            case 5: {
                AnonymousWeight anonymousWeight = new AnonymousWeight() {
                };
                Collections.sort(thing, anonymousWeight);
                System.out.println(thing);
            } break;

            case 6: {
                AnonymousLength anonymousLength = new AnonymousLength() {
                };
                Collections.sort(thing, anonymousLength);
                System.out.println(thing);
            } break;

            case  7: {
                AnonymousWidth anonymousWidth = new AnonymousWidth() {
                };
                Collections.sort(thing, anonymousWidth);
                System.out.println(thing);
            }break;

            case 8: {
                getIElement(thing);
            }break;

            case 9:{
                exit(thing);
            }break;
        }


    }
    


}
