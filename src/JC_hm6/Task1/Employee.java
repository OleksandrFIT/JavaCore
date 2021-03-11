package JC_hm6.Task1;

public class Employee implements Salary {

    private double Salary;

    public Employee(double salary) {
        Salary = salary;
    }

    @Override
    public void salary() {
        System.out.println(Salary);
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
