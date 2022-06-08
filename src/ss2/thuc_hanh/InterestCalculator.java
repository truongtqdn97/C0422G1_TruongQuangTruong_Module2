package ss2.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.print("Enter investment amount: ");
        money = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter number of months: ");
        month = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(scanner.nextLine());

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }

        System.out.println("Total of interest: "+ totalInterest);
    }
}
