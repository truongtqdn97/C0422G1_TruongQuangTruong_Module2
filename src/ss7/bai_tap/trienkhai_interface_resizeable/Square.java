package ss7.bai_tap.trienkhai_interface_resizeable;

import ss6.thuc_hanh.Rectangle;

public class Square extends Rectangle implements IResizeable{
    public Square(){
        setWidth(1.0);
        setLength(1.0);
    }
    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color,filled, side, side);
    }

    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "+ this.getSide()+ ", which is a subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+getSide()*percent);
    }
}
