package ss5.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height: ");
        double height = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of rectangle: " + rectangle.getArea() );
    }
}
