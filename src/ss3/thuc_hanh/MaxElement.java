package ss3.thuc_hanh;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size>20) System.out.println("Size does not exceed 20");
        }while (size>20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Property list: ");
        for (int i: array) {
            System.out.print(i+"\t");
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
                index = i+1;
            }
        }
        System.out.println("\nThe largest property value in the list is "+ max+" at position " + index);
    }
}
