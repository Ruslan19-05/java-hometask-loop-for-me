package az.edu.turing.OOP;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name+"~:"+salary);
    }

    public void calculateBonus(double percentage,double fixedAmount) {

        double bonus = salary * (percentage / 100);
        System.out.print("Bonus:" + bonus);
    }

    public String toString(){
        return name+","+salary;
    }
}
