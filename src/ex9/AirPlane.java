package ex9;

public class AirPlane extends Vehicle {
    private int speed;

    public AirPlane(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println(name + "di chuyen tren 0"+ "voi toc do: "+speed);
    }

    @Override
    public void sound() {
        System.out.println(name + "Vroommmmmmmmmm");
    }
}
