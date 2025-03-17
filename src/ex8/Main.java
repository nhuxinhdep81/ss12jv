package ex8;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics("Electronics 1", 100.0);
        Product p2 = new Clothing("Clothing 2", 200.0);
        Product p3 = new Food("Food3", 300.0);

        System.out.println("Tinh gia gia cuoi cung cua 1 sp");
        System.out.println(p1.getFinalPrice());
        System.out.println(p2.getFinalPrice());
        System.out.println(p3.getFinalPrice());

        System.out.println("------------------------------");
        System.out.println("Tinh gia tri cuopi cung cho nhieu san pham");
        System.out.println(p1.getFinalPrice(28));
        System.out.println(p2.getFinalPrice(7));
        System.out.println(p3.getFinalPrice(2005));

    }
}
