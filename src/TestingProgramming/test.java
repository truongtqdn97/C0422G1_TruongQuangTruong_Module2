package TestingProgramming;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println(solution(str));
    }
    public static String solution(String str){

        String string = "";
//        String string = Character.toString(str.charAt(0));

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))||i==0){
                string += Character.toString(str.charAt(i));
            }
            else string += " " + Character.toString(str.charAt(i));
        }
        return string.toLowerCase();
    }
}
