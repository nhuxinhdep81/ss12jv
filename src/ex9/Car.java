package ex9;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + "di chuyen tren mat dat");
    }

    @Override
    public void sound() {
        System.out.println(name + "Vroommmmmmmmmm");
    }
}
