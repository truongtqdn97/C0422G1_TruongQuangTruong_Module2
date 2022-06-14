package ss6.bai_tap.point;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);

        Point2D point2D2 = new Point2D(1.2f,2.3f);
        System.out.println(Arrays.toString(point2D2.getXY()));
        System.out.println(point2D2);

        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        point3D1.setXYZ(1,2,3);
        System.out.println(point3D1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }
}
