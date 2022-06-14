package ss6.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height = 3.0;
    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + " " + super.toString();
    }
}
