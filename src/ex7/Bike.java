package ex7;

public class Bike extends Vehicle{
    @Override
    public void move(){
        System.out.println("Di chuyen cham");
    }

    @Override
    public void sound(){
        System.out.println("Phát ra âm thanh ring ring ");
    }
}
