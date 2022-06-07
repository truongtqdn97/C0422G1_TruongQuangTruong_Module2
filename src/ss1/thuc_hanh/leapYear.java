package ss1.thuc_hanh;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = Integer.parseInt(scanner.nextLine());
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) System.out.printf("%d is a leap year", year);
//                else System.out.printf("%d is not a leap year", year);
//            } else System.out.printf("%d is a leap year", year);
//        } else System.out.printf("%d is not a leap year", year);

        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }


        if (isLeapYear) System.out.printf("%d is a leap year!",year);
        else System.out.printf("%d is not a leap year!", year);
    }
}
