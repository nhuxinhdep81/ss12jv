package ex9;

public class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "di chuyen cham");
    }

    @Override
    public void sound() {
        System.out.println(name + "Ring ring");
    }
}
