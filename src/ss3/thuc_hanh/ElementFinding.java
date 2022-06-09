package ss3.thuc_hanh;

import java.util.Scanner;

public class ElementFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a student 's name: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of student in the list " + name + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) System.out.println("Not found "+name+" in the list");
    }
}
