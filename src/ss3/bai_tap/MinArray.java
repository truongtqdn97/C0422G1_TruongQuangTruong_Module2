package ss3.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter index %d: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        System.out.printf("The minimum number in the array is %d at position %d", min,index);
    }
}
