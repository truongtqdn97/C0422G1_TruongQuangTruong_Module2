package ss11.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class IntegerStackReverse {
    static Scanner scanner = new Scanner(System.in);
    public static void integerReverse(int[] arr){
        Stack<Integer> integerStack = new Stack<>();
        for (int a : arr) {
            integerStack.push(a);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integerStack.pop();
        }
    }
    public static String wordReverse(String word){
        Stack<Character> wStack = new Stack<>();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            wStack.push(c);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = wStack.pop();
        }

        StringBuilder wordBuilder = new StringBuilder();
        for (char aChar : chars) {
            wordBuilder.append(aChar);
        }
        word = wordBuilder.toString();
        return word;
    }
    public static void main(String[] args) {

        //tao mang chua cac so nguyen a[i]
        System.out.print("Enter number of elements in the array: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter index %d: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Pre-reverse: ");
        for (int a :
                arr) {
            System.out.print(a+"\t");
        }
        integerReverse(arr);
        System.out.println("\nAfter-reverse: ");
        for (int a :
                arr) {
            System.out.print(a+"\t");
        }

        System.out.println("\nEnter a string: ");
        String str = scanner.nextLine();
        str = wordReverse(str);
        System.out.print("After-reverse: "+str);

    }
}
