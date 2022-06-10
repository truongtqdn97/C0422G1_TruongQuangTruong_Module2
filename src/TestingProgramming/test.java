package TestingProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2};
        change1(arr);
        System.out.println(Arrays.toString(arr));
        change2(arr);
        System.out.println(Arrays.toString(arr));
        int a;
    }
    public static void change1(int[] array){
        array[0] = 999;
    }

    public static void change2(int[] array){
        int[] array2 = {777,888};
        array = array2;
    }
}
