package ss7.thuc_hanh.comparable_thuchanh;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(){}

    public ComparableCircle(double radius){
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()) return 1;
        else if (getRadius()<o.getRadius()) return -1;
        else return 0;
    }
}
//https://github.com/codegym-vn/apj-shape
