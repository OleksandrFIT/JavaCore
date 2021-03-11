package JC_hm6.Task1;

public class Application {
    public static void main(String[] args) {

        Employee_H employee_h = new Employee_H(15.0, 250.0);
        Employee employee = new Employee(3500);

        System.out.println("Працівник із зарплатою погодинно: ");
        employee_h.salary();
        System.out.println("Працівник із фіксованою зарплатою: ");
        employee.salary();

    }
}
