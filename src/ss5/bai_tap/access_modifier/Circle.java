package ss5.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(double r){
        this.radius = r;
    }
    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
}
