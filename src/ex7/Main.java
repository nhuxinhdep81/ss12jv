package ex7;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicle= {new Car(), new Bike(), new Bus()};

        // in ra move va sound cho tung phuong tien
        for (Vehicle v : vehicle) {
            v.move();
            v.sound();
            System.out.println("-------------------");
        }
    }
}
