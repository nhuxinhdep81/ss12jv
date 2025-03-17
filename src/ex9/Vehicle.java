package ex9;

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move();
    public abstract void sound();

    public void move(int time, int speed){
        double distance = time * speed;
        System.out.println("da di chuyuenv oi khoang cach la : "+distance);
    }
}
