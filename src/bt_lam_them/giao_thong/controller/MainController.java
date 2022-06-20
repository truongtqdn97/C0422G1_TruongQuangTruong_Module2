package bt_lam_them.giao_thong.controller;

import java.util.Scanner;

public class MainController {

//    private static InterfaceService interface = new Interface();

    public static void displayMenu(){

        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "\n Chọn chức năng:" +
                    "\n 1. Thêm mới phương tiện" +
                    "\n 2. Hiển thị phương tiện" +
                    "\n 3. Xoá phương tiện" +
                    "\n 4. Tìm kiếm theo biển kiểm soát" +
                    "\n 5. Thoát");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    //code add()
                    break;
                case 2:
                    //code display()
                    break;
                case 3:
                    //code delete()
                    break;
                case 4:
                    //code search()
                    break;
                case 5:
                    flag = false;
                default:
                    System.out.println("Nhập lại chức năng!");
            }
        }while (flag);


    }
}
