package JC_hm6.Task1;

public class Employee_H implements Salary {
    @Override
    public void salary() {
        Salary = WageRate * WTime;
        System.out.println(Salary);
    }

    private double Salary;
    private double WageRate;
    private double WTime;

    public Employee_H(double wageRate, double WTime) {
        this.WageRate = wageRate;
        this.WTime = WTime;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getWageRate() {
        return WageRate;
    }

    public void setWageRate(double wageRate) {
        WageRate = wageRate;
    }

    public double getWTime() {
        return WTime;
    }

    public void setWTime(double WTime) {
        this.WTime = WTime;
    }

}
