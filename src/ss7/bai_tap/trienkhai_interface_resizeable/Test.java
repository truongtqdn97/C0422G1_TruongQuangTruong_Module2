package ss7.bai_tap.trienkhai_interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(2.0,5.0,"Navy", true);
        shapes[1] = new Circle(3.0);
        shapes[2] = new Rectangle(2.4,3.6,"Blue", false);
        shapes[3] = new Circle(2.5, "Green", false);

        double percent = (Math.floor(Math.random() * 100) + 1) / 100;
        System.out.println("Pre-resize: ");
        for (Shape shape:shapes){
            System.out.println(shape);
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
        }
        System.out.println(percent);

        System.out.println("After-resize: ");
        for (Shape shape:shapes){
            shape.resize(percent);
            System.out.println(shape);
        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
        }





    }
}
