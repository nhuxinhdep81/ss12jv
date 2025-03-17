package ex4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(4.5, 4.5);


        System.out.println("DIen tich o overLoading");
        System.out.println("dien tich hinh tron: "+shape.area(5));
        System.out.println("dien tich hcn: "+ shape.area(3,5));


        System.out.println("DIen tich o overRiding");
        System.out.println("dien tich hinh tron: "+circle.area(10));
        System.out.println("dien tich hcn: "+ rectangle.area(11,12));
    }
}
