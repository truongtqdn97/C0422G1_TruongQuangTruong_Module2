package ss1.thuc_hanh;
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month you want to count days? ");
        int month = Integer.parseInt(scanner.nextLine());

        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                break;
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s day!", month, daysInMonth);
        else System.out.println("Invalid input");

    }
}
