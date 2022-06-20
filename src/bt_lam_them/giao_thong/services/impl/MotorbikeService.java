package bt_lam_them.giao_thong.services.impl;

import bt_lam_them.giao_thong.model.Manufacturer;
import bt_lam_them.giao_thong.model.Motorbike;
import bt_lam_them.giao_thong.services.IMotorbikeService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeService implements IMotorbikeService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Manufacturer> MOTOR_MANUFACTURER_LIST = new ArrayList<>();
    //không được thay đổi danh sách hãng sản xuất

    static {
        MOTOR_MANUFACTURER_LIST.add(new Manufacturer(1, "Honda", "Japan"));
        MOTOR_MANUFACTURER_LIST.add(new Manufacturer(2, "Yamaha", "Japan"));
        MOTOR_MANUFACTURER_LIST.add(new Manufacturer(3, "Ducati", "Italy"));
    }

    public static ArrayList<Motorbike> motorbikeList = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Nhập biển kiểm soát: ");
        int numberPlate = Integer.parseInt(scanner.nextLine());

        System.out.println("Danh sách các hãng sản xuất: ");
        for (Manufacturer motor : MOTOR_MANUFACTURER_LIST) {
            System.out.println(motor);
        }
        Manufacturer producer = MOTOR_MANUFACTURER_LIST.get(0);
        System.out.print("Nhập mã hãng sản xuất: ");
        int code = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < MOTOR_MANUFACTURER_LIST.size(); i++) {
            if (code == MOTOR_MANUFACTURER_LIST.get(i).getCode()) {
                producer = MOTOR_MANUFACTURER_LIST.get(i);
            }
        }

        System.out.print("\nNhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("\nNhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập công suất: ");
        double wattage = Double.parseDouble(scanner.nextLine());

        Motorbike newMotorbike = new Motorbike(numberPlate, producer, yearOfManufacture, owner, wattage);
        motorbikeList.add(newMotorbike);
    }

    @Override
    public void display() {
        for (int i = 0; i < motorbikeList.size(); i++) {
            System.out.println(motorbikeList.get(i));
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
