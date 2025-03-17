package ex7;

public class Car extends Vehicle {

    @Override
    public void move(){
        System.out.println("Di chuyen nhanh");
    }

    @Override
    public void sound(){
        System.out.println("Phát ra âm thanh Vroom ");
    }
}
