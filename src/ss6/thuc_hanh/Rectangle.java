package ss6.thuc_hanh;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter(){
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of "+ super.toString();
    }

}