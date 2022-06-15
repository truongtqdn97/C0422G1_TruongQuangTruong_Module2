package ss7.bai_tap.trienkhai_interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3.0);
        shapes[1] = new Circle(2.0);
        shapes[2] = new Rectangle(4.0,5.0);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
            if (shapes[i] instanceof Square){
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
