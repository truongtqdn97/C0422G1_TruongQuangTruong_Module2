package TestingProgramming;

import java.util.Scanner;

public class VeHinhThoi {
    public static void main(String[] args) {

        //cach 1
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int x1 = x - 1;
        int x2 = x + 1;
        int firth = 1;
        for (int i = 1; i < x * 2; i++) {
            for (int j = 0; j < x * 2 + 1; j++) {
                if (j == x1 || j == x2) {
                    System.out.print(firth);
                } else {
                    System.out.print(" ");
                }
            }
            if (i >= x) {
                firth--;
                x1++;
                x2--;
            } else {
                firth++;
                x1--;
                x2++;
            }
            System.out.println("");
        }
        //cach 2
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i+(i-1); j++) {
                if(j==0 || j == i + (i-1) ) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i + (i-1); j >=0 ; j--) {
                if(j==0 || j == i + (i-1)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

