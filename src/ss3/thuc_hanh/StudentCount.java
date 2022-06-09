package ss3.thuc_hanh;

import java.util.Scanner;

public class StudentCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size>30){
                System.out.println("Size should not exceed 30");
            }
        }while (size>30);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a mark for student "+(i+1)+": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int count = 0;
        System.out.print("List of marks: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
            if (arr[i]>=5 && arr[i]<=10) count++;
        }
        System.out.println("\nThe number of students passing the exam is: "+count);
    }
}
