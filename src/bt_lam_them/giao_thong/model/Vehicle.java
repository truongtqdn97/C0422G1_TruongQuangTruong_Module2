package bt_lam_them.giao_thong.model;

public class Vehicle {
    protected int numberPlate;
    protected Manufacturer producer;
    protected int yearOfManufacture;
    protected String owner;

    public Vehicle() {
    }

    public Vehicle(int numberPlate, Manufacturer producer, int yearOfManufacture, String owner) {
        this.numberPlate = numberPlate;
        this.producer = producer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }
}
