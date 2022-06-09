package ss3.bai_tap;

import java.util.Scanner;

public class SumOfColArr2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // khai bao va khoi tao mang 2 chieu
        System.out.print("Enter number of rows in the matrix: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of columns in the matrix: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[][] arr2d = new double[m][n];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.printf("Enter index [%d][%d]: ", i, j);
                arr2d[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        // nhap vao thu tu cua cot
        int col;
        do {
            System.out.print("Enter column number need to calculate: ");
            col = Integer.parseInt(scanner.nextLine());
            if (col<0||col>m) System.out.printf("Enter column number again (from 0 to %d)!", m);
        }while (col<0||col>m);
        double sum =0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (j==col) sum += arr2d[i][j];
            }
        }
        System.out.printf("\nThe total of column %d is: %f", col,sum);
    }
}
