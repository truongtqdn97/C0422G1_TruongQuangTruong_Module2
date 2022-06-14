package ss6.bai_tap.point_moveablepoint;

public class MovablePoint extends Point {
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;

    public MovablePoint() {
    }

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        return new double[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{(x,y) = (" + super.getX() + "," + super.getY() + ")" +
                ", speed = (" + xSpeed + "," + ySpeed + ")}";
    }

    public MovablePoint move(){
        super.setX(super.getX()+this.xSpeed);
        super.setY(super.getY()+this.ySpeed);
        return this;
    }
}
