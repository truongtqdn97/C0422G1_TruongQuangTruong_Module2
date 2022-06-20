package bt_lam_them.giao_thong.services.impl;

import bt_lam_them.giao_thong.model.Car;
import bt_lam_them.giao_thong.model.Manufacturer;
import bt_lam_them.giao_thong.services.ICarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService implements ICarService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Manufacturer> CAR_MANUFACTURER_LIST = new ArrayList<>();
    //không được thay đổi danh sách hãng sản xuất

    static {
        CAR_MANUFACTURER_LIST.add(new Manufacturer(1, "BMW", "Germany"));
        CAR_MANUFACTURER_LIST.add(new Manufacturer(2, "Toyota", "Japan"));
        CAR_MANUFACTURER_LIST.add(new Manufacturer(3, "KIA", "Korea"));
    }

    public static ArrayList<Car> cars = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Nhập biển kiểm soát: ");
        int numberPlate = Integer.parseInt(scanner.nextLine());

        System.out.println("Danh sách các hãng sản xuất: ");
        for (int i = 0; i < CAR_MANUFACTURER_LIST.size(); i++) {
            System.out.println(CAR_MANUFACTURER_LIST.get(i));
        }
        Manufacturer producer = CAR_MANUFACTURER_LIST.get(0);
        System.out.print("\nNhập mã của nhà sản xuất: ");
        int code = Integer.parseInt(scanner.nextLine());//cần người kiểm tra
        int i = 0;
        while (i < CAR_MANUFACTURER_LIST.size()) {
            if (code == CAR_MANUFACTURER_LIST.get(i).getCode()) {
                producer = CAR_MANUFACTURER_LIST.get(i);
            }
            i++;
        }
        System.out.print("\nNhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.print("\nNhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Nhập kiểu xe: ");
        String type = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        int seat = Integer.parseInt(scanner.nextLine());

        Car newCar = new Car(numberPlate, producer, yearOfManufacture, owner, seat, type);
        cars.add(newCar);
    }

    @Override
    public void display() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
