package ex7;

public class Bus extends Vehicle{
    @Override
    public void move(){
        System.out.println("Di chuyen voi toc do trung binh");
    }

    @Override
    public void sound(){
        System.out.println("Phát ra âm thanh honk honk ");
    }
}
