package ss1.bai_tap;

import java.util.Scanner;

public class UsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int RATE = 23000;
        System.out.print("Enter USD: ");
        int usd = Integer.parseInt(scanner.nextLine());
        int vnd = usd * RATE;
        System.out.printf("VND: %d",vnd);
    }
}
