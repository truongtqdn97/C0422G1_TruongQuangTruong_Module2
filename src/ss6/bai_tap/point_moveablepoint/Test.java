package ss6.bai_tap.point_moveablepoint;

public class Test {
    public static void main(String[] args) {
//        Point point = new Point(1,2);
//        System.out.println(point);

        //ep kieu
        Point point = new MovablePoint(1,2,3,4);
        System.out.println(((MovablePoint) point).move());

//        MovablePoint movablePoint = new MovablePoint(3,4);
//        movablePoint.setX(10);
//        movablePoint.setY(20);
//
//        System.out.println(movablePoint.move());

    }
}
