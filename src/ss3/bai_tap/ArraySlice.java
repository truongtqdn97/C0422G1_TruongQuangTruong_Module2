package ss3.bai_tap;

import javax.print.attribute.standard.MediaSize;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySlice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //khai bao va khoi tao mang so nguyen gom n phan tu duoc nhap tu ban phim
        int[] arr;
        System.out.print("Enter number of elements in the array: ");
        int n = Integer.parseInt(scanner.nextLine());
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter index %d: ",i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        //nhap x la phan tu can xoa
        System.out.print("Enter the element need to delete: ");
        int x = Integer.parseInt(scanner.nextLine());

        //tim x co trong mang hay ko, chi ra vi tri cua X (neu co)
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) System.out.printf("Positon of %d in the array is index %d",x,index);
        else {
            System.out.printf("%d does not exist in the array", x);
            System.exit(0);
        }

        //xoa x khoi mang
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
