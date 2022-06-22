package ss12.bai_tap.controller;

import ss12.bai_tap.service.ProductManager;

import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.print("Product Managerment Application:" +
                    "\n1. Add new product." +
                    "\n2. Edit product 's information." +
                    "\n3. Delete product." +
                    "\n4. Display list of products." +
                    "\n5. Search product." +
                    "\n6. Sort list of products." +
                    "\n7. Exit." +
                    "\n Please choose one option above: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addNew();
                    break;
                case 2:
                    productManager.edit();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    productManager.sortByPrice();
                    break;
                case 7:
                    System.out.println("Exit the application!");
                    break;
                default:
                    System.out.println("Please choose from 1 to 7!");
            }
        } while (choice != 7);
    }

}
