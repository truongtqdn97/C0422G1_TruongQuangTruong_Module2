package ss7.thuc_hanh.comparator_thuchanh;

import ss7.thuc_hanh.comparable_thuchanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.0,"Navy", false);
        System.out.println("Pre-sorted:");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);


        System.out.println("After-sorted: ");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
