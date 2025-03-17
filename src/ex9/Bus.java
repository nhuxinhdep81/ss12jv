package ex9;

public class Bus extends Vehicle {
    private int seat;

    public Bus(String name, int seat) {
        super(name);
        this.seat = seat;
    }

    @Override
    public void move() {
        System.out.println(name + "di chuyen tren mat dat"+ "so ghe ngoi: " + seat);
    }

    @Override
    public void sound() {
        System.out.println(name + "Whooshhhhhhhh");
    }
}
