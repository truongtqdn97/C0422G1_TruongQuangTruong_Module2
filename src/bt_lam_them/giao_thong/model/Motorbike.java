package bt_lam_them.giao_thong.model;

public class Motorbike extends Vehicle{
    private double wattage;//cong suat xe may

    public Motorbike(double wattage) {
        this.wattage = wattage;
    }

    public Motorbike(int numberPlate, Manufacturer producer, int yearOfManufacture, String owner, double wattage) {
        super(numberPlate, producer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public Motorbike() {
    }
}
