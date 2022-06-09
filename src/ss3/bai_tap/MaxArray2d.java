package ss3.bai_tap;

import java.util.Scanner;

public class MaxArray2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khoi tao va khai bao ma tran m*n nhap tu nguoi dung
        System.out.print("Enter number of rows in the matrix: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of columns in the matrix: ");
        int n = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter index arr[%d][%d]: ",i,j);
                arr[i][j] = Double.parseDouble(scanner.nextLine());
            }
        }

        //hien thi ma tran
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        double max = arr[0][0];
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.printf("The Maximum number in the matrix is: %f at position [%d][%d]", max,a,b);
    }
}
