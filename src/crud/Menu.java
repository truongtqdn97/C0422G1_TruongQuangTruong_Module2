package crud;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displaymenu();
    }
    public static void displaymenu(){
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;

        do {
            System.out.println("Menu" +
                    "\n1. Create a new student" +
                    "\n2. Read the list" +
                    "\n3. Update" +
                    "\n4. Delete a student" +
                    "\n5. Search a student" +
                    "\n6. Exit");
            System.out.print("Please choose one option: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Create a new student!");
                    studentManager.add();
                    break;
                case 2:
                    System.out.println("Read the list: ");
                    studentManager.display();
                    break;
                case 3:
                    System.out.println("Update");
                    studentManager.edit();
                    break;
                case 4:
                    System.out.println("Delete a student");
                    studentManager.delete();
                    break;
                case 5:
                    System.out.println("Search a student");
                    break;
                case 6:
                    System.out.println("Exit the program.");
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
                    break;
            }
        }while (choice!=6);

    }

}
