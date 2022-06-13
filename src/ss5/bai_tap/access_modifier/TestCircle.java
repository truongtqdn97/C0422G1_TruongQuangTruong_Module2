package ss5.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }
}
