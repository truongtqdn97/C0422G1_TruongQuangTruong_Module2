package bt_lam_them.giao_thong.model;

public class Car extends Vehicle{
    private int seat;
    private String type;

//    private boolean styleCar;
//    private final boolean DU_LICH = true;
//    private final boolean XE_KHACH = false;

    public Car() {
    }

    public Car(int seat, String type) {
        this.seat = seat;
        this.type = type;
    }

    public Car(int numberPlate, Manufacturer producer, int yearOfManufacture, String owner, int seat, String type) {
        super(numberPlate, producer, yearOfManufacture, owner);
        this.seat = seat;
        this.type = type;
    }
}
