package ss3.bai_tap;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the char: ");
        char c = scanner.nextLine().charAt(0);
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (c==str.charAt(i)) count++;
        }
        if (count==0) System.out.printf("Char %c does not exist in the string.",c);
        else System.out.printf("Char %c appear %d times in the string", c, count);
    }
}
