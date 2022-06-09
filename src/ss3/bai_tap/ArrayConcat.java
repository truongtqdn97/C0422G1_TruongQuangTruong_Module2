package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //nhap mang 1
        System.out.println("Enter the first array.");
        System.out.print("Enter the number of elements in the array: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Enter index %d: ",i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        //nhap mang 2
        System.out.println("Enter the second array.");
        System.out.print("Enter the number of elements in the array: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Enter index %d: ",i);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        //tao mang moi gop tu 2 mang da nhap
        int n3 = n1+n2;
        int[] arr3 = new int[n3];
        for (int i = 0; i < arr3.length; i++) {
            if (i>=arr1.length) {
                arr3[i] = arr2[i-arr1.length];
            }
            else arr3[i] = arr1[i];
        }

        //in ra mang vua duoc gop
        System.out.println(Arrays.toString(arr3));
    }
}
