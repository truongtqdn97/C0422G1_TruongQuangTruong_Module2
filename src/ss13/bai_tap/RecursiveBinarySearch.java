package ss13.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int value){
        int mid;
        if (left==right) return -1;
        else {
            mid = (left+right)/2;
            if (arr[mid]==value)
                return mid;
            else if (value>arr[mid]) {
                return binarySearch(arr, (mid + 1), right, value);
            }else return binarySearch(arr, left,(mid-1),value);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.println("Enter value need to search.");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println(binarySearch(arr,arr[0],arr[arr.length-1],value));
    }
}
