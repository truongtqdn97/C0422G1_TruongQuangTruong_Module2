package ss11.bai_tap;

import java.util.*;

public class Palindrome {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isPalindrome(String str){
        Stack<Character> characterStack = new Stack<>();
        Queue<Character> characterArrayDeque = new ArrayDeque<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            characterStack.push(aChar);
            characterArrayDeque.add(aChar);
        }

        for (int i = 0; i < chars.length; i++) {
            if (characterStack.pop()!=characterArrayDeque.poll()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println(isPalindrome(str));

    }
}