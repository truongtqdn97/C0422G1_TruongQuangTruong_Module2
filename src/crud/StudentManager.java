package crud;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    static Student[] studentsArray = new Student[1000];

    static {
        studentsArray[0] = new Student(1, "Name example", "Address example", true);
        studentsArray[1] = new Student(2, "Name example", "Address example", true);
        studentsArray[2] = new Student(3, "Name example", "Address example", true);
    }

    //crud
    public void display() {
        for (Student s : studentsArray) {
            if (s != null) {
                System.out.println(s);
            } else break;
        }
    }

    public int enterId() {
        int id;
        boolean flag;
        do {
            flag = false;
            System.out.print("Enter id:");
            id = Integer.parseInt(scanner.nextLine());
            if (id < 1) {
                System.out.println("Enter id again!");
                flag = true;
                continue;
            }
            for (int i = 0; i < studentsArray.length; i++) {
                if (studentsArray[i] != null) {
                    if (studentsArray[i].getId() == id) {
                        System.out.println("your ID has been duplicated");
                        flag = true;
                        break;
                    }
                }

            }
        } while (flag);
        return id;
    }

    public void add() {
        int id = enterId();
        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter address:");
        String address = scanner.nextLine();
        System.out.print("Enter gender:");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        Student student = new Student(id, name, address, gender);
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
                break;
            }
        }
        display();
    }

    public void edit() {
        System.out.print("Enter id that needs to edit: ");
        int index = -1;
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null) {
                if (studentsArray[i].getId() == idEdit) {
                    index = i;
                    System.out.println(studentsArray[i]);
                    break;
                }
            }
        }
        if (index == -1) {
            System.out.println("Can't find input ID");
            return;
        }
        studentsArray[index] = null;
        int id = enterId();
        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter gender:");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        Student student = new Student(id, name, address, gender);
        studentsArray[index] = student;
    }

    public void delete() {
        int id;
        boolean flag;
        int index = 0;
        do {
            flag = true;
            System.out.print("Enter ID needs to delete: ");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < studentsArray.length; i++) {
                if (studentsArray[i].getId() == id) {
                    flag = false;
                    index = i;
                    break;
                }
            }
        } while (flag);
        for (int i = index; i < studentsArray.length - 1; i++) {
            studentsArray[i] = studentsArray[i + 1];
        }
    }
}
