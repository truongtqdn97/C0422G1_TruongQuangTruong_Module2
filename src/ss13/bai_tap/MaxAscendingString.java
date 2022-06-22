package ss13.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxAscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        ArrayList<Character> list = new ArrayList<>();
            list.add(string.charAt(0));

            for (int j = 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1)) {
                    list.add(string.charAt(j));
                }
            }

        for (Character ch : list) {
            System.out.print(ch);
        }
    }
}
