package ss6.thuc_hanh;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius +", which is a subclass of " + super.toString();
    }

}
