package ss3.thuc_hanh;

import java.util.Scanner;

public class TemperatureConvert {
    public static double cToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double fToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f,c;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    f = Double.parseDouble(scanner.nextLine());
                    System.out.println("Fahrenheit to Celsius "+ fToC(f));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    c = Double.parseDouble(scanner.nextLine());
                    System.out.println("Celsius to Fahrenheit "+cToF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
}
