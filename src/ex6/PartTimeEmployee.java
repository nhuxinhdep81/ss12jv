package ex6;

public class PartTimeEmployee extends Employee {
    private int hoursWorks;

    public PartTimeEmployee(String name, int age, double basicSalary, int hoursWorks) {
        super(name, age, basicSalary);
        this.hoursWorks = hoursWorks;
    }

    @Override
    public double calculateSalary() {
        return basicSalary * this.hoursWorks;
    }

    @Override
        public void showInfo(){
            System.out.println("Nhan vien poart time");
            System.out.println("Name: " + this.getName());
            System.out.println("Age: " + this.getAge());
            System.out.println("Basic Salary: " + calculateSalary());
    }
}
