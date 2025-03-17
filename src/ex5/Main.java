package ex5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(5, 6);
        shapes[2] = new Square(5);

        System.out.println("dien tich cac hinh la");
        for(int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
    }
}
