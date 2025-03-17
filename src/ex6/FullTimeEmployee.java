package ex6;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int age, double basicSalary, double bonus) {
        super(name, age, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + this.bonus;
    }

    @Override
    public void showInfo(){
        System.out.println("Nhien vien full time:");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Basic Salary: " + calculateSalary());
    }
}
