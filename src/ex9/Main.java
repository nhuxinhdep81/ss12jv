package ex9;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("xe oto");
        Vehicle bike = new Bike("xe dap");
        Vehicle bus = new Bus("xe bus", 28);
        Vehicle airplane = new AirPlane("Máy bay", 2005);

        car.move();
        car.sound();
        System.out.println("----------------");

        bike.move();
        bike.sound();
        System.out.println("------------------");

        bus.move();
        bus.sound();
        System.out.println("------------------");

        airplane.move();
        airplane.sound();
        System.out.println("-------------------");

        // tinh khaongr cach dua tren time * speed
        car.move(2, 60);
        bike.move(3, 15);
        bus.move(5, 80);
        airplane.move(1, 900);
    }
}
