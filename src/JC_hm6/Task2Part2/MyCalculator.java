package JC_hm6.Task2Part2;

import JC_hm6.Task2.Numerable;

public class MyCalculator implements Numerable {
    private int first;
    private int second;

    public MyCalculator(int first, int second) {
        this.first=first;
        this.second=second;
    }

    public void plus()
    {
        int res= first+ second;
        System.out.println("Результат дії додавання: "+ res);
    }

    public void minus()
    {
        int res1= first- second;
        System.out.println("Результат дії віднімання: "+ res1);
    }
    public void multiply()
    {
        int res2= first* second;
        System.out.println("Результат дії множення: "+ res2);
    }
    public void devide()
    {
        int res3= first/ second;
        System.out.println("Результат дії ділення: "+ res3);
    }
}
