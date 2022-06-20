package bt_lam_them.giao_thong.services.impl;

import bt_lam_them.giao_thong.model.Manufacturer;
import bt_lam_them.giao_thong.model.Truck;
import bt_lam_them.giao_thong.services.ITruckService;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckService implements ITruckService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Manufacturer> TRUCK_MANUFACTURER_LIST = new ArrayList<>();
    //danh sách hãng sản xuất không thay đổi

    static {
        TRUCK_MANUFACTURER_LIST.add(new Manufacturer(1, "ISUZU", "Japan"));
        TRUCK_MANUFACTURER_LIST.add(new Manufacturer(2, "HYUNDAI", "Korea"));
        TRUCK_MANUFACTURER_LIST.add(new Manufacturer(3, "THACO", "Vietnam"));
    }

    public static ArrayList<Truck> truckList = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Nhập biển kiểm soát: ");
        int numberPlate = Integer.parseInt(scanner.nextLine());

        System.out.println("Danh sách các hãng sản xuất: ");
        for (int i = 0; i < TRUCK_MANUFACTURER_LIST.size(); i++) {
            System.out.println(TRUCK_MANUFACTURER_LIST.get(i));
        }
        Manufacturer producer = TRUCK_MANUFACTURER_LIST.get(0);
        System.out.print("\nNhập mã hãng sản xuất: ");
        int code = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < TRUCK_MANUFACTURER_LIST.size(); i++) {
            if (code == TRUCK_MANUFACTURER_LIST.get(i).getCode()) {
                producer = TRUCK_MANUFACTURER_LIST.get(i);
            }
        }

        System.out.print("\nNhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("\nNhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("\nNhập tải trọng: ");
        double load = Double.parseDouble(scanner.nextLine());

        Truck newTruck = new Truck(numberPlate, producer, yearOfManufacture, owner, load);
        truckList.add(newTruck);
    }

    @Override
    public void display() {
        for (int i = 0; i < truckList.size(); i++) {
            System.out.println(truckList.get(i));
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
