package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khai bao mang so nguyen gom n phan tu
        System.out.print("Enter number of elements in the array: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter index %d: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        //nhap x la phan tu can them
        System.out.print("Enter the element need to insert into the array: ");
        int x = Integer.parseInt(scanner.nextLine());
        //nhap vi tri can chen x vao mang
        int index;
        do {
            System.out.printf("Enter position need to insert %d into the array: ", x);
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index >= arr.length) System.out.println("Enter position again!");
        } while (index < 0 || index >= arr.length);

        //hien thi truoc sau khi chen
        System.out.println(Arrays.toString(arr));

        //them phan tu vao trong mang
        for (int i = arr.length - 1; i >= index; i--) {
            if (i == index) arr[i] = x;
            else
                arr[i] = arr[i - 1];
        }

        //hien thi mang sau khi chen
        System.out.println(Arrays.toString(arr));
    }
}
