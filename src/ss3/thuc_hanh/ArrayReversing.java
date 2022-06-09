package ss3.thuc_hanh;

import java.util.Scanner;

public class ArrayReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size>20) System.out.println("Size does not exceed 20");
        }while (size>20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+ (i+1)+": ");
            array[i]= Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Elements in array: ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
        }
        System.out.print("\nReverse array: ");
        for (int j : array) {
            System.out.print(j+"\t");
        }

    }
}
