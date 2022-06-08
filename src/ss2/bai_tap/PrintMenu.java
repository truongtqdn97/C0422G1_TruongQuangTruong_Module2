package ss2.bai_tap;

import java.util.Scanner;

public class PrintMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu\n" +
                    "1. Print the rectangle\n" +
                    "2. Print the square triangle\n" +
                    "3. Print isosceles triangle\n" +
                    "4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            int len;
            switch (choice){
                case 1:
                    System.out.print("Enter width of rectangle: ");
                    int width = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter height of rectangle: ");
                    int height = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= height ; i++) {
                        for (int j = 1; j <= width ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter size of square of triangle: ");
                    len = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= len; i++) {
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter size of isosceles triangle: ");
                    len = Integer.parseInt(scanner.nextLine());
                    for (int i = 1; i <= len ; i++) {
                        for (int j = 1; j <= (len-i) ; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j < (2*i); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit program!");
                    break;
                default:
                    System.out.println("Please choose again!(from 1-4)");
                    break;
            }
        }while (choice!=4);

    }
}
