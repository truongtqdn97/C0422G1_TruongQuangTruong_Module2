package ss15.bai_tap.TriangleExceptionExercise;

import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle. ");
        Triangle triangle;
        do {
            try {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                double c = Double.parseDouble(scanner.nextLine());
                triangle = new Triangle(a,b,c);
                break;
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
//            e.printStackTrace();
            } catch (NumberFormatException e){
                System.err.println("Not enter text");
            }
        }while (true);

        System.out.println(triangle);
    }
}
