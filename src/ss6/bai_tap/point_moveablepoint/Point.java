package ss6.bai_tap.point_moveablepoint;

import ss6.bai_tap.point.Point3D;

public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point(){}

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double[] getXY(){
        return new double[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "Point{(x,y) = (" + x + "," + y + ")}";
    }
}
