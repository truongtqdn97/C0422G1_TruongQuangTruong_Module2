package ss17.bai_tap.product_manager;

import java.util.Scanner;

public class MainTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        int choice;
        do {
            System.out.println("Menu \n" +
                    "1. Add new product \n" +
                    "2. Display list of products \n" +
                    "3. Search by name \n" +
                    "4. Exit" +
                    "Choose one above ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.addToFile();
                    break;
                case 2:
                    productManager.displayFile();
                    break;
                case 3:
                    productManager.searchByName();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter again. ");
                    break;
            }
        }while (choice!=4);
    }
}
