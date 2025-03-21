package ex4;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}
