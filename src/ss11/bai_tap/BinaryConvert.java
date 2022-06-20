package ss11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConvert {
    static Scanner scanner = new Scanner(System.in);

    public static String decimalToBinary(int number) {
        Stack<Integer> binaryStack = new Stack<>();
        while (number != 0) {
            binaryStack.push(number % 2);
            number = number / 2;
        }
        String binary = "";
        int length = binaryStack.size();
        for (int i = 0; i < length; i++) {
            binary += binaryStack.pop();
        }
        return binary;
    }

    public static int binaryToDecimal(int number) {
        Stack<Integer> decimalStack = new Stack<>();
        int decimal = 0;
        while (number != 0) {
            decimalStack.push(number % 10);//
            number = number / 10;
        }
        int length = decimalStack.size();
        for (int i = length - 1; i >= 0; i--) {
            decimal += decimalStack.pop() * Math.pow(2, i);
        }
        return decimal;
    }

    public static void main(String[] args) {
//        System.out.println("Enter a Decimal number: ");
//        int num = Integer.parseInt(scanner.nextLine());
//        System.out.println("Binary number: "+decimalToBinary(num));

        System.out.println("Enter a Binary number: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Decimal number : " + binaryToDecimal(num));
    }
}
