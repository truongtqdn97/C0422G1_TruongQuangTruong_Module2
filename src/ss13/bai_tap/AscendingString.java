package ss13.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        ArrayList<Character> maxList = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {

            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.get(list.size() - 1)) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
            list.clear();
        }

        for (Character ch : maxList) {
            System.out.print(ch);
        }
    }
}
