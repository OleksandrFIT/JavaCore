package JC_hm4.Task2;

public class Application {
    public static void main(String[] args) {
        Car a= new Car(4, 2.5, new Body("a") , new Helm(3.5), new Wheel(7.0));
        a.getAge();
        a.getDiametr();
        a.getFuelUsing();
        a.getSize();
        a.getType();


        //Перший варіант
        System.out.println(a);

        //Другий варіант
        System.out.println(a.getDiametr());
        System.out.println(a.getSize());
        System.out.println(a.getType());
        System.out.println(a.getAge());
        System.out.println(a.getFuelUsing());
    }
}
