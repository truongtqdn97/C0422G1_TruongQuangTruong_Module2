package ss4.bai_tap.QuadraticEquationSolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation expression = new QuadraticEquation(a,b,c);
        if (expression.getDelta()>0){
            System.out.printf("The equation has two roots: %f and %f", expression.getRoot1(), expression.getRoot2());
        }else if (expression.getDelta()==0){
            System.out.printf("The equation has 1 root: %f", expression.getRoot1());
        }else {
            System.out.println("The equation has no real root!");
        }
    }
}
