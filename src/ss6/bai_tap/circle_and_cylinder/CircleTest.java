package ss6.bai_tap.circle_and_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Red");
        System.out.println(circle);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, "Green", 3.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        Cylinder cylinder2 = new Cylinder();
        System.out.println(cylinder2);
        System.out.println(cylinder2.getVolume());
    }
}
