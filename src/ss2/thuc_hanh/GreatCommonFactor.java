package ss2.thuc_hanh;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b: ");
        b = Integer.parseInt(scanner.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("Greatest common factor is "+ (Math.max(a,b)));
        else if (a == b) {
            System.out.println("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else b = b - a;
            }

            System.out.println("Greatest common factor is " + a);
        }
    }
}
