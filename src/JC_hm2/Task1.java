package JC_hm2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введіть суму: ");
        Scanner sc= new Scanner(System.in);
        int money =sc.nextInt();
        System.out.println("Введіть %: ");
        int n= sc.nextInt();
        System.out.println("Введіть к-ть років для депозиту: ");
        int k= sc.nextInt();

      //  int onePer= money / 100;
      //  int n1 = onePer * n;
        int money1 = 0;
        
        if (k <= 0){
            System.out.println("Error");
        }else if(k > 1){
            for (int i=1; i <= k; i++){
                int res1= money / 100* n * k; // num of deposite
                money1= money+ res1;
            }
        } else {
            money1= money / 100* n * k;
        }

        System.out.println(money1);
    }
}
