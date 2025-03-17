package ex6;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Nguyễn Văn A", 30, 1000, 500),
                new PartTimeEmployee("Trần Thị B", 25, 10, 40),
                new Intern("Lê Văn C", 22, 500)
        };

        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("-----------------------");
        }
    }
}

