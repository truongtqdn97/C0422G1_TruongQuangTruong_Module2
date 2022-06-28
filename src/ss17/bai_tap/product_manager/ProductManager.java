package ss17.bai_tap.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    public void addToFile(){
        System.out.println("Enter code: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter note: ");
        String note = scanner.nextLine();

        List<Product> products = readFile();
        products.add(new Product(code, name, manufacturer, price, note));

        File file = new File("src/ss17/bai_tap/product.csv");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                assert fos != null;
                fos.close();
                assert oos != null;
                oos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public List<Product> readFile(){
        List<Product> products = new ArrayList<>();

        File file = new File("src/ss17/bai_tap/product.csv");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            if (file.length()>0){
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);
                products = (List<Product>) ois.readObject();
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (file.length()>0){
                    fis.close();
                    ois.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return products;
    }

    public void displayFile(){
        List<Product> products = readFile();
        System.out.println("Danh sach san pham: ");
        for (Product product: products){
            System.out.println(product);
        }
    }

    public void searchByName(){
        List<Product> products = readFile();
        System.out.println("Enter name of product: ");
        String name = scanner.nextLine();

        for (int i = 0; i < products.size(); i++) {
            if (name.equals(products.get(i).getName())){
                System.out.println(products.get(i));
                return;
            }
        }
        System.out.println("Can't search product!");
    }
}
