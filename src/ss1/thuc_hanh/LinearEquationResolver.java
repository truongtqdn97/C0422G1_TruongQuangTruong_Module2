package ss1.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given an equation as 'a * x + b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if (a != 0) {
            double answer = (b - c) / a;
            System.out.printf("Equation pass with x = %f \n", answer);
        } else if (b == c) System.out.println("The solution is all x!");
        else System.out.println("No solution!");
    }
}
