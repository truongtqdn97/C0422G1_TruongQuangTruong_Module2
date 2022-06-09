package ss3.thuc_hanh;

import java.util.Scanner;

public class MinElement {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]<array[index]) index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {8,30,5,12,7,36};
        int index = minValue(array);
        System.out.println(index);
    }
}
