package ss2.thuc_hanh;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j == 1 || j == i || i == 5) {
                                System.out.print("*");
                            } else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 || i == 5) {
                                System.out.print("*");
                            } else if (j == 1 || j == 5) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                            System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (i == 1 || i == 3) {
                                System.out.print("*");
                            } else if (j == 1 || j == 5) {
                                System.out.print("*");
                            } else
                                System.out.print(" ");
                            System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
