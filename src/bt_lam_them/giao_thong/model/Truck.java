package bt_lam_them.giao_thong.model;

public class Truck extends Vehicle{
    private double load;

    public Truck() {
    }

    public Truck(double load) {
        this.load = load;
    }

    public Truck(int numberPlate, Manufacturer producer, int yearOfManufacture, String owner, double load) {
        super(numberPlate, producer, yearOfManufacture, owner);
        this.load = load;
    }
}
