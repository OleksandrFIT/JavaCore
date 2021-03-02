package JC_hm2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введіть суму: ");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextInt();
        System.out.println("Введіть %: ");
        double n = sc.nextInt();
        System.out.println("Введіть к-ть років для депозиту: ");
        double k = sc.nextInt();

        //  int onePer= money / 100;
        //  int n1 = onePer * n;
        //int money1 = 0;

        if (k <= 0) {
            System.out.println("Error");
        } else if (k > 1) {
            for (int i = 1; i <= k; i++) {
                double res1 = money / 100 * n; // num of deposite
                money = money + res1;
                System.out.println(money);
            }
        } else {
            money = money / 100 * n * k;
        }

        System.out.println(money);
    }
}
