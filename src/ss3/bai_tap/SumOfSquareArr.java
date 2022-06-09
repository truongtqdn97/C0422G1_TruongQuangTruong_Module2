package ss3.bai_tap;

import java.util.Scanner;

public class SumOfSquareArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao va khoi tao mang 2 chieu
        int m, n;
        do {
            System.out.print("Enter number of rows in the matrix: ");
            m = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number of columns in the matrix: ");
            n = Integer.parseInt(scanner.nextLine());
            if (m != n) System.out.println("Please enter row number equal to column number!");
        } while (m != n);

        double[][] arr2d = new double[m][n];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.printf("Enter index [%d][%d]: ", i, j);
                arr2d[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        // tinh tong duong cheo
        double sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (i == j) sum += arr2d[i][j];
            }
        }
        System.out.printf("\nThe total of diagonal line is %.2f",sum);
    }
}
