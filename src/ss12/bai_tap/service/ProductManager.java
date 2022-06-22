package ss12.bai_tap.service;

import ss12.bai_tap.model.Product;
import ss12.bai_tap.util.ProductSortAscending;
import ss12.bai_tap.util.ProductSortDescending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager implements IProductManager{
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<>();

    public static boolean isIdExist(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) return true;
        }
        return false;
    }

    @Override
    public void addNew() {
        int id;
        do {
            System.out.print("Enter id of product: ");
            id = Integer.parseInt(scanner.nextLine());
            if (isIdExist(id)) System.out.println("Id has been duplicated." +
                    "\nEnter id of product again");
        } while (isIdExist(id));

        System.out.print("Enter name of product: ");
        String name = scanner.nextLine();
        System.out.print("Enter price of product: ");
        int price = Integer.parseInt(scanner.nextLine());

        productList.add(new Product(id, name, price));
        display();
    }

    @Override
    public void edit() {
        int id;
        if (productList.isEmpty()){
            System.out.println("There is 0 product in line.");
            return;
        }
        do {
            System.out.print("Enter id of product need to edit: " +
                    "\nEnter -1 to exit editing.");
            id = Integer.parseInt(scanner.nextLine());
            if (id == -1) return;
            if (!isIdExist(id)) System.out.println("Id is not exist in line." +
                    "\nEnter id again!");
        } while (!isIdExist(id));
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.print("Enter new name of product: ");
                String name = scanner.nextLine();
                System.out.print("Enter new price of product: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
            }
        }
        System.out.println("Edit successfully");
        display();
    }

    public void delete() {
        System.out.print("Enter id of product need to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!isIdExist(id)) {
            System.out.println("Id is not exist in line.");
            return;
        }
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId())
                productList.remove(i);
        }
        display();
    }

    public void display() {
        System.out.println("List of product: ");
        if (productList.isEmpty()) {
            System.out.println("There is 0 products." +
                    "\n Please add more products into the list.");
            return;
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchByName() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
                return;
            }
        }
        System.out.println("Product does not exist in line");
    }

    public void sortByPrice() {
        ProductSortAscending productSortAscending = new ProductSortAscending();
        ProductSortDescending productSortDescending = new ProductSortDescending();
        System.out.println("Which sort do you want? " +
                "\n1. Ascending." +
                "\n2. Descending.");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            Collections.sort(productList, productSortAscending);
        } else Collections.sort(productList, productSortDescending);
        display();
    }
}
